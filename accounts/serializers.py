from rest_framework import serializers
from .models import CustomUser

class UserRegistrationSerializer(serializers.ModelSerializer):
    password = serializers.CharField(write_only=True, min_length=6)

    class Meta:
        model = CustomUser
        fields = [
            'id', 'email', 'password', 'full_name', 'phone_number',
            'province', 'target_course', 'profile_picture', 'user_status',
            'created_at', 'updated_at'
        ]
        read_only_fields = ['id', 'user_status', 'created_at', 'updated_at']

    def create(self, validated_data):
        # Garante que a palavra-passe é encriptada com o algoritmo seguro do Django
        password = validated_data.pop('password')
        username = validated_data.get('email') # Usa o email como username
        
        user = CustomUser.objects.create_user(
            username=username,
            password=password,
            **validated_data
        )
        return user


class UserLoginSerializer(serializers.Serializer):
    email = serializers.EmailField()
    password = serializers.CharField(write_only=True)


class UserProfileSerializer(serializers.ModelSerializer):
    class Meta:
        model = CustomUser
        fields = [
            'id', 'email', 'full_name', 'phone_number',
            'province', 'target_course', 'profile_picture', 'user_status',
            'created_at', 'updated_at'
        ]