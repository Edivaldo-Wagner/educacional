from rest_framework.permissions import IsAuthenticated
from rest_framework.generics import UpdateAPIView
from rest_framework.views import APIView
from rest_framework.response import Response
from rest_framework import status, parsers
from django.contrib.auth import authenticate
from .models import CustomUser
from .serializers import UserRegistrationSerializer, UserLoginSerializer, UserProfileSerializer

class RegisterView(APIView):
    # Permite envio de JSON e de MultiPart (para upload da foto de perfil)
    parser_classes = [parsers.MultiPartParser, parsers.FormParser, parsers.JSONParser]

    def post(self, request):
        serializer = UserRegistrationSerializer(data=request.data)
        if serializer.is_valid():
            user = serializer.save()
            return Response({
                "message": "Utilizador registado com sucesso!",
                "user": UserProfileSerializer(user).data
            }, status=status.HTTP_201_CREATED)
        return Response(serializer.errors, status=status.HTTP_400_BAD_REQUEST)


class LoginView(APIView):
    def post(self, request):
        serializer = UserLoginSerializer(data=request.data)
        if serializer.is_valid():
            email = serializer.validated_data['email']
            password = serializer.validated_data['password']
            
            user = authenticate(request, username=email, password=password)
            if user:
                return Response({
                    "message": "Login efetuado com sucesso!",
                    "user": UserProfileSerializer(user).data
                }, status=status.HTTP_200_OK)
            return Response({"detail": "Credenciais inválidas."}, status=status.HTTP_401_UNAUTHORIZED)
        return Response(serializer.errors, status=status.HTTP_400_BAD_REQUEST)
    

class UpdateProfileView(APIView):
    parser_classes = [parsers.MultiPartParser, parsers.FormParser, parsers.JSONParser]

    def put(self, request, email):
        try:
            user = CustomUser.objects.get(email=email)  # Trocado de UserProfile para CustomUser
        except CustomUser.DoesNotExist:
            return Response({"detail": "Utilizador não encontrado."}, status=status.HTTP_404_NOT_FOUND)

        user.full_name = request.data.get('full_name', user.full_name)
        user.phone_number = request.data.get('phone_number', user.phone_number)
        user.province = request.data.get('province', user.province)
        user.target_course = request.data.get('target_course', user.target_course)

        if 'profile_picture' in request.FILES:
            user.profile_picture = request.FILES['profile_picture']

        user.save()
        return Response({
            "message": "Perfil atualizado com sucesso!",
            "user": UserProfileSerializer(user).data
        }, status=status.HTTP_200_OK)