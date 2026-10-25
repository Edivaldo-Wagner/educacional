from django.contrib import admin
from .models import Subject, Topic, Exam, Question, Option

class OptionInline(admin.TabularInline):
    model = Option
    extra = 4

class QuestionAdmin(admin.ModelAdmin):
    inlines = [OptionInline]
    list_display = ('question_text', 'subject', 'difficulty', 'exam')
    list_filter = ('subject', 'difficulty', 'exam')
    search_fields = ('question_text',)

admin.site.register(Subject)
admin.site.register(Topic)
admin.site.register(Exam)
admin.site.register(Question, QuestionAdmin)