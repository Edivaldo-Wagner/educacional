from rest_framework import serializers
from .models import Subject, Topic, Exam, Question, Option, MultiplayerRoom

class OptionSerializer(serializers.ModelSerializer):
    class Meta:
        model = Option
        fields = ['id', 'text', 'is_correct']

class QuestionSerializer(serializers.ModelSerializer):
    options = OptionSerializer(many=True)
    subject_id = serializers.PrimaryKeyRelatedField(queryset=Subject.objects.all(), source='subject', write_only=True)
    subject_name = serializers.CharField(source='subject.name', read_only=True)
    topic_name = serializers.CharField(source='topic.name', read_only=True, required=False)

    class Meta:
        model = Question
        fields = [
            'id', 'subject_id', 'subject_name', 'topic_name', 'question_text', 
            'difficulty', 'explanation', 'teacher_hint', 'options'
        ]

    def create(self, validated_data):
        options_data = validated_data.pop('options', [])
        question = Question.objects.create(**validated_data)
        for opt_data in options_data:
            Option.objects.create(question=question, **opt_data)
        return question

    def update(self, instance, validated_data):
        options_data = validated_data.pop('options', None)
        instance.question_text = validated_data.get('question_text', instance.question_text)
        instance.difficulty = validated_data.get('difficulty', instance.difficulty)
        instance.explanation = validated_data.get('explanation', instance.explanation)
        instance.teacher_hint = validated_data.get('teacher_hint', instance.teacher_hint)
        if 'subject' in validated_data:
            instance.subject = validated_data['subject']
        instance.save()

        if options_data is not None:
            instance.options.all().delete()
            for opt_data in options_data:
                Option.objects.create(question=instance, **opt_data)
        return instance

class ExamSerializer(serializers.ModelSerializer):
    subject_name = serializers.CharField(source='subject.name', read_only=True)
    subject = serializers.PrimaryKeyRelatedField(queryset=Subject.objects.all(), write_only=True, required=False) 
    questions = QuestionSerializer(many=True, read_only=True)

    class Meta:
        model = Exam
        fields = ['id', 'title', 'subject_name', 'subject', 'year', 'duration_minutes', 'is_official', 'questions']

class SubjectSerializer(serializers.ModelSerializer):
    class Meta:
        model = Subject
        fields = ['id', 'name', 'code', 'emoji']

class MultiplayerRoomSerializer(serializers.ModelSerializer):
    subject_name = serializers.CharField(source='subject.name', read_only=True)
    subject_code = serializers.CharField(source='subject.code', read_only=True)
    
    class Meta:
        model = MultiplayerRoom
        fields = '__all__'