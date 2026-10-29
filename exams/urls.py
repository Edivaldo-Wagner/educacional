# exams/urls.py
from django.urls import path, include
from rest_framework.routers import DefaultRouter
from .views import SubjectViewSet, ExamViewSet, QuestionViewSet, MultiplayerViewSet

router = DefaultRouter()
router.register(r'subjects', SubjectViewSet, basename='subject')
router.register(r'exams', ExamViewSet, basename='exam')
router.register(r'questions', QuestionViewSet, basename='question') 
router.register(r'multiplayer', MultiplayerViewSet, basename='multiplayer')

urlpatterns = [
    path('', include(router.urls)),
]