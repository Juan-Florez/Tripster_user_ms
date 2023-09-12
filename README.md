# Tripster_user_ms
Microservicio de usuarios 

# Microservicio Gestión de usuarios
Este microservicio ofrece las funcionalidades para la creación, edición, visualización y eliminación de usuarios.

# Requisitos previos
Es necesario tener instalado Docker y Java

# Pasos para ejecutar el programa

1. Clonar este repositorio:
```cmd
git clone https://github.com/Juan-Florez/Tripster_user_ms.git
```
2. Montar el contenedor docker para la base de datos:
```cmd
docker run -d --name mongodb -p 27017:27017 mongo
```
3. En el directorio de la aplicacion, ejecutar el comando:
```cmd
./mvnw spring-boot:run
```
