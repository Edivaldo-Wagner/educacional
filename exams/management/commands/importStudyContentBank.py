import os
import re
from django.core.management.base import BaseCommand
from exams.models import Subject, StudyModule

class Command(BaseCommand):
    help = 'Lê o StudyContentBank.kt e importa os módulos pedagógicos de História e Português para o PostgreSQL'

    def handle(self, *args, **kwargs):
        base_dir = os.path.dirname(os.path.dirname(os.path.dirname(os.path.dirname(os.path.abspath(__file__)))))
        pasta_kotlin = os.path.join(base_dir, 'dados_originais')

        if not os.path.exists(pasta_kotlin):
            pasta_kotlin = 'dados_originais'

        caminho_file = os.path.join(pasta_kotlin, 'StudyContentBank.kt')
        if not os.path.exists(caminho_file):
            self.stdout.write(self.style.ERROR("Ficheiro StudyContentBank.kt não encontrado na pasta dados_originais!"))
            return

        with open(caminho_file, 'r', encoding='utf-8') as f:
            conteudo = f.read()

        self.stdout.write(self.style.SUCCESS("A processar o StudyContentBank.kt..."))

        # Configurar Disciplinas
        historia, _ = Subject.objects.get_or_create(code='HISTORIA', defaults={'name': 'História', 'emoji': '🏛️'})
        portugues, _ = Subject.objects.get_or_create(code='PORTUGUES', defaults={'name': 'Português', 'emoji': '📚'})

        # Dividir por blocos de StudyModule(
        blocos = conteudo.split('StudyModule(')
        contador = 0

        for bloco in blocos[1:]:
            def extrair(padrao, texto, default=""):
                match = re.search(padrao, texto, re.DOTALL)
                return match.group(1).strip() if match else default

            mod_id = extrair(r'id\s*=\s*"([^"]+)"', bloco, f"MOD_{contador}")
            subj_str = extrair(r'subject\s*=\s*Subject\.([A-Z]+)', bloco, "HISTORIA")
            title = extrair(r'title\s*=\s*"([^"]+)"', bloco, "")
            subtitle = extrair(r'subtitle\s*=\s*"([^"]+)"', bloco, None)
            topic_tag = extrair(r'topicTag\s*=\s*"([^"]+)"', bloco, None)
            
            # Sumário multilinhas com """
            summary_match = re.search(r'summary\s*=\s*"""(.*?)"""', bloco, re.DOTALL)
            summary = summary_match.group(1).strip() if summary_match else ""

            # Extrair keyPoints listOf(...)
            kp_block = extrair(r'keyPoints\s*=\s*listOf\s*\((.*?)\)', bloco)
            key_points = re.findall(r'"([^"]+)"', kp_block) if kp_block else []

            subject = historia if "HISTORIA" in subj_str else portugues

            StudyModule.objects.update_or_create(
                module_id=mod_id,
                defaults={
                    'subject': subject,
                    'title': title,
                    'subtitle': subtitle,
                    'topic_tag': topic_tag,
                    'summary': summary,
                    'key_points': key_points,
                }
            )
            contador += 1

        self.stdout.write(self.style.SUCCESS(f"Sucesso total! Foram importados {contador} módulos de estudo pedagógico para o PostgreSQL."))
