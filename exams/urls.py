from django.urls import path
from .views import ExamListView, QuestionBySubjectView

urlpatterns = [
    path('exams/', ExamListView.as_view(), name='exam-list'),
    path('questions/<str:subject_code>/', QuestionBySubjectView.as_view(), name='questions-by-subject'),
]