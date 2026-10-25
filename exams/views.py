from rest_framework import generics
from .models import Exam, Question
from .serializers import ExamSerializer, QuestionSerializer

class ExamListView(generics.ListAPIView):
    queryset = Exam.objects.all()
    serializer_class = ExamSerializer

class QuestionBySubjectView(generics.ListAPIView):
    serializer_class = QuestionSerializer

    def get_queryset(self):
        subject_code = self.kwargs['subject_code']
        return Question.objects.filter(subject__code=subject_code)