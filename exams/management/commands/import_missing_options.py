from django.core.management.base import BaseCommand
from exams.models import Question, Option

class Command(BaseCommand):
    help = 'Insere cirurgicamente as opções em falta associadas aos question_id'

    def handle(self, *args, **kwargs):
        # Lista com as questões e opções que estavam a faltar
        dados_faltantes = [
            {
                "question_id": 438,
                "options": [
                    "Fortaleza de São Sebastião / Dondo",
                    "Fortaleza de São Caetano de Sofala"
                ],
                "correctIndex": 0
            },
            {
                "question_id": 457,
                "options": [
                    "A condenação unânime do colonialismo e a afirmação do Movimento dos Não-Alinhados",
                ],
                "correctIndex": 0
            },
            {
                "question_id": 460,
                "options": [
                    "A Comunidade de Santo Egídio e o Governo italiano"
                ],
                "correctIndex": 0
            },
            {
                "question_id": 473,
                "options": [
                    "Indicar posse entre dois substantivos, concordando com a coisa possuída e nunca aceitando artigo depois dele",
                    "Indicar lugar fixo em substituição à palavra 'onde'",
                    "Introduzir orações adverbiais temporais no passado"
                ],
                "correctIndex": 0
            },
            {
                "question_id": 495,
                "options": [
                    "José Craveirinha",
                    "Rui de Noronha"
                ],
                "correctIndex": 0
            }
        ]

        inseridas = 0
        for item in dados_faltantes:
            q_id = item["question_id"]
            try:
                question = Question.objects.get(id=q_id)

                for idx, opt_text in enumerate(item["options"]):
                    Option.objects.create(
                        question=question,
                        text=opt_text,
                        is_correct=(idx == item["correctIndex"])
                    )
                inseridas += 1
                self.stdout.write(self.style.SUCCESS(f"Opções inseridas com sucesso para a questão ID {q_id}"))
            except Question.DoesNotExist:
                self.stdout.write(self.style.WARNING(f"Aviso: Questão com ID {q_id} não encontrada na base de dados."))

        self.stdout.write(self.style.SUCCESS(f"Processo concluído! Total de questões atualizadas: {inseridas}"))