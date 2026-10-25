import os
import re
from django.core.management.base import BaseCommand
from exams.models import Subject, Exam, Question, Option, Topic

class Command(BaseCommand):
    help = 'Lê o OfficialQuestionsBank.kt e importa todas as 100 questões oficiais com metadados avançados para o PostgreSQL'

    def handle(self, *args, **kwargs):
        base_dir = os.path.dirname(os.path.dirname(os.path.dirname(os.path.dirname(os.path.abspath(__file__)))))
        pasta_kotlin = os.path.join(base_dir, 'dados_originais')

        if not os.path.exists(pasta_kotlin):
            pasta_kotlin = 'dados_originais'

        if not os.path.exists(pasta_kotlin):
            self.stdout.write(self.style.ERROR(f"A pasta 'dados_originais' não foi encontrada!"))
            return

        # 1. Configurar Disciplinas e Exames Oficiais
        historia, _ = Subject.objects.get_or_create(
            code='HISTORIA', 
            defaults={'name': 'História', 'emoji': '🏛️'}
        )
        portugues, _ = Subject.objects.get_or_create(
            code='PORTUGUES', 
            defaults={'name': 'Português', 'emoji': '📚'}
        )

        exam_hist, _ = Exam.objects.get_or_create(
            title='Exame de Admissão de História - UEM (Canónico Oficial)',
            subject=historia,
            defaults={'year': 2025, 'is_official': True, 'duration_minutes': 120}
        )
        exam_port, _ = Exam.objects.get_or_create(
            title='Exame de Admissão de Português - UEM (Canónico Oficial)',
            subject=portugues,
            defaults={'year': 2025, 'is_official': True, 'duration_minutes': 120}
        )

        caminho_file = os.path.join(pasta_kotlin, 'OfficialQuestionsBank.kt')
        if not os.path.exists(caminho_file):
            self.stdout.write(self.style.ERROR("Ficheiro OfficialQuestionsBank.kt não encontrado."))
            return

        with open(caminho_file, 'r', encoding='utf-8') as f:
            conteudo = f.read()

        self.stdout.write(self.style.SUCCESS("A processar o OfficialQuestionsBank.kt com parser avançado..."))

        blocos_questoes = conteudo.split('Question(')
        
        contador = 0
        for bloco in blocos_questoes[1:]:
            def extrair_campo(padrao, texto, default=""):
                match = re.search(padrao, texto, re.DOTALL)
                return match.group(1).strip() if match else default

            q_id = extrair_campo(r'id\s*=\s*"([^"]+)"', bloco, f"OFF_{contador}")
            subj_str = extrair_campo(r'subject\s*=\s*Subject\.([A-Z]+)', bloco, "HISTORIA")
            topic_name = extrair_campo(r'topic\s*=\s*"([^"]+)"', bloco, "Geral")
            subtopic = extrair_campo(r'subtopic\s*=\s*"([^"]+)"', bloco, None)
            diff_str = extrair_campo(r'difficulty\s*=\s*Difficulty\.([A-Z]+)', bloco, "MEDIO")
            q_text = extrair_campo(r'questionText\s*=\s*"([^"]+)"', bloco)
            
            explanation = extrair_campo(r'explanation\s*=\s*"([^"]+)"', bloco, None)
            teacher_hint = extrair_campo(r'teacherHint\s*=\s*"([^"]+)"', bloco, None)
            
            # Campos específicos do Banco Oficial
            q_type = extrair_campo(r'questionType\s*=\s*com\.example\.model\.QuestionType\.([A-Z]+)', bloco, "OFICIAL")
            source = extrair_campo(r'source\s*=\s*"([^"]+)"', bloco, None)
            exam_name = extrair_campo(r'examName\s*=\s*"([^"]+)"', bloco, None)
            
            year_str = extrair_campo(r'examYear\s*=\s*([0-9]+)', bloco, "2024")
            exam_year = int(year_str) if year_str.isdigit() else 2024

            num_str = extrair_campo(r'questionNumber\s*=\s*([0-9]+)', bloco, "1")
            question_number = int(num_str) if num_str.isdigit() else 1

            is_official_ans_str = extrair_campo(r'isOfficialAnswer\s*=\s*(true|false)', bloco, "false")
            is_official_answer = (is_official_ans_str == "true")

            review_status = extrair_campo(r'reviewStatus\s*=\s*"([^"]+)"', bloco, None)

            # Extrair ocorrências da lista listOf(...)
            occ_block = extrair_campo(r'occurrences\s*=\s*listOf\s*\((.*?)\)', bloco)
            occurrences = re.findall(r'"([^"]+)"', occ_block) if occ_block else []

            correct_idx_str = extrair_campo(r'correctIndex\s*=\s*([0-9]+)', bloco, "0")
            correct_index = int(correct_idx_str) if correct_idx_str.isdigit() else 0

            options_block = extrair_campo(r'options\s*=\s*listOf\s*\((.*?)\)', bloco)
            options = re.findall(r'"([^"]+)"', options_block)

            if not q_text:
                continue

            # Mapear Disciplina e Exame Oficial
            if "HISTORIA" in subj_str:
                subject = historia
                exam = exam_hist
            else:
                subject = portugues
                exam = exam_port

            diff_map = {"FACIL": "FACIL", "MEDIO": "MEDIO", "DIFICIL": "DIFICIL"}
            difficulty = diff_map.get(diff_str, "MEDIO")

            topic_obj, _ = Topic.objects.get_or_create(
                subject=subject,
                name=topic_name
            )

            # Criar Pergunta preenchendo os campos oficiais e metadados
            question = Question.objects.create(
                exam=exam,
                subject=subject,
                topic=topic_obj,
                question_text=q_text,
                difficulty=difficulty,
                explanation=explanation,
                teacher_hint=teacher_hint,
                subtopic=subtopic,
                question_type=q_type,
                source=source,
                exam_name=exam_name,
                exam_year=exam_year,
                question_number=question_number,
                is_official_answer=is_official_answer,
                reviewStatus=review_status,
                occurrences=occurrences
            )

            # Inserir Opções da Questão
            for idx, opt_text in enumerate(options):
                Option.objects.create(
                    question=question,
                    text=opt_text,
                    is_correct=(idx == correct_index)
                )

            contador += 1

        self.stdout.write(self.style.SUCCESS(f"Sucesso total! Foram importadas {contador} questões oficiais com todos os metadados pedagógicos."))