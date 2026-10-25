from django.db import models

class Subject(models.Model):
    name = models.CharField(max_length=100, unique=True)  # ex: História, Português
    code = models.SlugField(max_length=50, unique=True)    # ex: historia, portugues
    emoji = models.CharField(max_length=10, default="📚")

    def __str__(self):
        return self.name

class Topic(models.Model):
    subject = models.ForeignKey(Subject, on_delete=models.CASCADE, related_name='topics')
    name = models.CharField(max_length=200)
    description = models.TextField(blank=True, null=True)

    def __str__(self):
        return f"{self.subject.name} - {self.name}"

class Exam(models.Model):
    title = models.CharField(max_length=200) # ex: Simulado UEM 2026, Exame Real 2024
    subject = models.ForeignKey(Subject, on_delete=models.CASCADE, related_name='exams')
    year = models.IntegerField(blank=True, null=True)
    duration_minutes = models.IntegerField(default=60)
    is_official = models.BooleanField(default=False)

    def __str__(self):
        return self.title

class Question(models.Model):
    DIFFICULTY_CHOICES = [
        ('FACIL', 'Fácil'),
        ('MEDIO', 'Médio'),
        ('DIFICIL', 'Difícil'),
    ]
    
    subject = models.ForeignKey(Subject, on_delete=models.CASCADE, related_name='questions')
    topic = models.ForeignKey(Topic, on_delete=models.SET_NULL, null=True, blank=True, related_name='questions')
    exam = models.ForeignKey(Exam, on_delete=models.SET_NULL, null=True, blank=True, related_name='questions')
    
    question_text = models.TextField()
    difficulty = models.CharField(max_length=10, choices=DIFFICULTY_CHOICES, default='MEDIO')
    explanation = models.TextField(blank=True, null=True)
    teacher_hint = models.TextField(blank=True, null=True)
    
    # NOVOS CAMPOS PARA QUESTÕES OFICIAIS
    subtopic = models.CharField(max_length=200, blank=True, null=True)
    question_type = models.CharField(max_length=50, default='OFICIAL')
    source = models.CharField(max_length=300, blank=True, null=True)
    exam_name = models.CharField(max_length=200, blank=True, null=True)
    exam_year = models.IntegerField(blank=True, null=True)
    question_number = models.IntegerField(blank=True, null=True)
    is_official_answer = models.BooleanField(default=False)
    reviewStatus = models.CharField(max_length=100, blank=True, null=True)
    occurrences = models.JSONField(blank=True, null=True) # Guarda a lista de ocorrências em formato JSON
    
    def __str__(self):
        return f"[{self.subject.name}] {self.question_text[:50]}..."

class Option(models.Model):
    question = models.ForeignKey(Question, on_delete=models.CASCADE, related_name='options')
    text = models.CharField(max_length=300)
    is_correct = models.BooleanField(default=False)

    def __str__(self):
        status = "✔" if self.is_correct else "✘"
        return f"{status} {self.text}"