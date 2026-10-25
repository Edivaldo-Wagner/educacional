from django.db import models
from django.contrib.auth.models import AbstractUser

PROVINCIAS_MOCAMBIQUE = [
    ('MAPUTO_CIDADE', 'Maputo Cidade'),
    ('MAPUTO_PROVINCIA', 'Maputo Província'),
    ('GAZA', 'Gaza'),
    ('INHAMBANE', 'Inhambane'),
    ('SOFALA', 'Sofala'),
    ('MANICA', 'Manica'),
    ('TETE', 'Tete'),
    ('ZAMBEZIA', 'Zambézia'),
    ('NAMPULA', 'Nampula'),
    ('NIASSA', 'Niassa'),
    ('CABO_DELGADO', 'Cabo Delgado'),
]

CURSOS_MOCAMBIQUE = [
    ('MEDICINA', 'Medicina Geral'),
    ('ENGENHARIA_INFORMATICA', 'Engenharia Informática'),
    ('DIREITO', 'Direito'),
    ('ECONOMIA', 'Economia'),
    ('ENGENHARIA_CIVIL', 'Engenharia Civil'), 
    ('CONTABILIDADE', 'Contabilidade e Finanças'),
    ('GESTAO', 'Gestão de Empresas'),
    ('ARQUITETURA', 'Arquitetura'), 
    ('CONTABILIDADE_F', 'Contabilidade'),
]

class CustomUser(AbstractUser):
    email = models.EmailField(unique=True, blank=False, null=False)
    
    # Campos específicos solicitados
    full_name = models.CharField(max_length=150)
    phone_number = models.CharField(max_length=20)
    province = models.CharField(max_length=50, choices=PROVINCIAS_MOCAMBIQUE)
    target_course = models.CharField(max_length=100, choices=CURSOS_MOCAMBIQUE)
    profile_picture = models.ImageField(upload_to='profiles/', null=True, blank=True)
    
    # Status do utilizador (ativo, suspenso, pendente, etc.)
    STATUS_CHOICES = [
        ('PENDING', 'Pendente'),
        ('ACTIVE', 'Ativo'),
        ('SUSPENDED', 'Suspenso'),
    ]
    user_status = models.CharField(max_length=20, choices=STATUS_CHOICES, default='ACTIVE')

    # Datas de criação e atualização automáticas
    created_at = models.DateTimeField(auto_now_add=True)  
    updated_at = models.DateTimeField(auto_now=True)      

    # Dizemos ao Django que o login principal será feito por e-mail e não pelo username tradicional
    USERNAME_FIELD = 'email'
    REQUIRED_FIELDS = ['username', 'full_name']

    class Meta:
        db_table = 'users'  # <-- Isto força o Django a nomear a tabela como 'users' no PostgreSQL

    def __str__(self):
        return f"{self.full_name} ({self.email})"