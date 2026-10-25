import os
import re
from django.core.management.base import BaseCommand
from exams.models import Subject, Exam, Question, Option, Topic

class Command(BaseCommand):
    help = 'Lê o QuestionBank.kt e importa todas as questões, explicações e dicas para o PostgreSQL'

    def handle(self, *args, **kwargs):
        base_dir = os.path.dirname(os.path.dirname(os.path.dirname(os.path.dirname(os.path.abspath(__file__)))))
        pasta_kotlin = os.path.join(base_dir, 'dados_originais')

        if not os.path.exists(pasta_kotlin):
            pasta_kotlin = 'dados_originais'

        if not os.path.exists(pasta_kotlin):
            self.stdout.write(self.style.ERROR(f"A pasta 'dados_originais' não foi encontrada!"))
            return

        # 1. Configurar Disciplinas e Exames
        historia, _ = Subject.objects.get_or_create(
            code='HISTORIA', 
            defaults={'name': 'História', 'emoji': '🏛️'}
        )
        portugues, _ = Subject.objects.get_or_create(
            code='PORTUGUES', 
            defaults={'name': 'Português', 'emoji': '📚'}
        )

        exam_hist, _ = Exam.objects.get_or_create(
            title='Banco de Estudo e Exames — História UEM',
            subject=historia,
            defaults={'year': 2024, 'is_official': True, 'duration_minutes': 120}
        )
        exam_port, _ = Exam.objects.get_or_create(
            title='Banco de Estudo e Exames — Português UEM',
            subject=portugues,
            defaults={'year': 2024, 'is_official': True, 'duration_minutes': 120}
        )

        caminho_qbank = os.path.join(pasta_kotlin, 'QuestionBank.kt')
        if not os.path.exists(caminho_qbank):
            self.stdout.write(self.style.ERROR("Ficheiro QuestionBank.kt não encontrado."))
            return

        with open(caminho_qbank, 'r', encoding='utf-8') as f:
            conteudo = f.read()

        self.stdout.write(self.style.SUCCESS("A processar o QuestionBank.kt com parser melhorado..."))

        # Dividir o conteúdo por cada instância de objeto Question(
        blocos_questoes = conteudo.split('Question(')
        
        contador = 0
        for bloco in blocos_questoes[1:]: # Ignorar o cabeçalho antes da primeira pergunta
            # Extrair atributos chave por chave de forma segura
            def extrair_campo(padrao, texto, default=""):
                match = re.search(padrao, texto, re.DOTALL)
                return match.group(1).strip() if match else default

            q_id = extrair_campo(r'id\s*=\s*"([^"]+)"', bloco, f"Q_{contador}")
            subj_str = extrair_campo(r'subject\s*=\s*Subject\.([A-Z]+)', bloco, "HISTORIA")
            topic_name = extrair_campo(r'topic\s*=\s*"([^"]+)"', bloco, "Geral")
            diff_str = extrair_campo(r'difficulty\s*=\s*Difficulty\.([A-Z]+)', bloco, "MEDIO")
            q_text = extrair_campo(r'questionText\s*=\s*"([^"]+)"', bloco)
            
            # Capturar explicações e dicas de forma isolada e segura
            explanation = extrair_campo(r'explanation\s*=\s*"([^"]+)"', bloco, None)
            teacher_hint = extrair_campo(r'teacherHint\s*=\s*"([^"]+)"', bloco, None)
            
            correct_idx_str = extrair_campo(r'correctIndex\s*=\s*([0-9]+)', bloco, "0")
            correct_index = int(correct_idx_str) if correct_idx_str.isdigit() else 0

            # Extrair opções dentro de listOf(...)
            options_block = extrair_campo(r'options\s*=\s*listOf\s*\((.*?)\)', bloco)
            options = re.findall(r'"([^"]+)"', options_block)

            if not q_text:
                continue

            # Mapear Disciplina e Exame
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

            # Criar Pergunta garantindo o preenchimento de explanation e teacher_hint
            question = Question.objects.create(
                exam=exam,
                subject=subject,
                topic=topic_obj,
                question_text=q_text,
                difficulty=difficulty,
                explanation=explanation,
                teacher_hint=teacher_hint
            )

            # Inserir Opções
            for idx, opt_text in enumerate(options):
                Option.objects.create(
                    question=question,
                    text=opt_text,
                    is_correct=(idx == correct_index)
                )

            contador += 1

        self.stdout.write(self.style.SUCCESS(f"Sucesso total! Foram importadas {contador} perguntas com explicações e dicas completas."))