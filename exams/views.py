from django.db import models
from rest_framework import generics, viewsets
from rest_framework.decorators import action
from rest_framework.response import Response
from .models import Subject, Exam, Question, MultiplayerRoom
from .serializers import SubjectSerializer, ExamSerializer, QuestionSerializer, MultiplayerRoomSerializer

class SubjectViewSet(viewsets.ModelViewSet): 
    queryset = Subject.objects.all()
    serializer_class = SubjectSerializer

# MUDANÇA: De ListAPIView para ModelViewSet para suportar GET, POST, PUT e DELETE de exames
class ExamViewSet(viewsets.ModelViewSet):
    queryset = Exam.objects.all()
    serializer_class = ExamSerializer

class QuestionViewSet(viewsets.ModelViewSet):
    queryset = Question.objects.all()
    serializer_class = QuestionSerializer

    def get_queryset(self):
        queryset = Question.objects.all()
        subject_code = self.request.query_params.get('subject_code', None)
        if subject_code:
            queryset = queryset.filter(subject__code__iexact=subject_code)
        return queryset

class MultiplayerViewSet(viewsets.ModelViewSet):
    queryset = MultiplayerRoom.objects.all()
    serializer_class = MultiplayerRoomSerializer 
    
    @action(detail=False, methods=['post'])
    def find_or_create_room(self, request):
        subject_code = request.data.get('subject_code')
        user_email = request.data.get('email')
        user_name = request.data.get('full_name')
        
        try:
            subject = Subject.objects.get(code__iexact=subject_code)
        except Subject.DoesNotExist:
            return Response({"error": "Disciplina não encontrada"}, status=400)
            
        # 1. Verificar se o utilizador já está numa sala ativa ou à espera (evita duplicados)
        existing_room = MultiplayerRoom.objects.filter(
            subject=subject,
            status__in=['WAITING', 'ACTIVE']
        ).filter(
            models.Q(player_one_email=user_email) | models.Q(player_two_email=user_email)
        ).first()

        if existing_room:
            serializer = self.get_serializer(existing_room)
            return Response(serializer.data)

        # 2. Procurar uma sala à espera criada por OUTRO utilizador
        room = MultiplayerRoom.objects.filter(
            subject=subject, 
            status='WAITING'
        ).exclude(player_one_email=user_email).first()
        
        if room:
            room.player_two_email = user_email
            room.player_two_name = user_name
            room.status = 'ACTIVE'
            room.save()
        else:
            # Criar nova sala (Player 1)
            qs = list(Question.objects.filter(subject=subject).values_list('id', flat=True))
            import random
            selected_ids = random.sample(qs, min(len(qs), 10))
            
            room = MultiplayerRoom.objects.create(
                subject=subject,
                player_one_email=user_email,
                player_one_name=user_name,
                question_ids=selected_ids,
                status='WAITING'
            )
            
        serializer = self.get_serializer(room)
        return Response(serializer.data)

    @action(detail=True, methods=['post'])
    def update_progress(self, request, pk=None):
        room = self.get_object()
        user_email = request.data.get('email')
        current_index = request.data.get('current_index', 0)
        score = request.data.get('score', 0)
        is_finished = request.data.get('is_finished', False)
        
        if room.player_one_email == user_email:
            room.player_one_index = current_index
            room.player_one_score = score
        elif room.player_two_email == user_email:
            room.player_two_index = current_index
            room.player_two_score = score
            
        # Se um terminou, podemos marcar o jogo como concluído ou aguardar o outro
        if is_finished:
            # Opcional: podes verificar se ambos terminaram, ou definir o vencedor logo que o primeiro acabe
            if not room.winner_name:
                if room.player_one_score >= room.player_two_score:
                    room.winner_name = room.player_one_name
                else:
                    room.winner_name = room.player_two_name
            room.status = 'FINISHED'
                
        room.save()
        return Response(self.get_serializer(room).data)