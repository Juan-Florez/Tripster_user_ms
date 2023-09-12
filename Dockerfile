# Utiliza una imagen base de OpenJDK 20.0.2 (ajusta la etiqueta según tu versión)
FROM openjdk:20-jdk

# Directorio de trabajo en el contenedor
WORKDIR /app

# Copia tu archivo JAR al contenedor (ajusta la ubicación si es necesario)
COPY out/artifacts/tripster_user_ms_jar/tripster_user_ms.jar /app/tripster_user_ms.jar

# Expone el puerto en el que se ejecuta la aplicación (ajusta según tu configuración)
EXPOSE 8080

# Comando para ejecutar la aplicación al iniciar el contenedor
CMD ["java", "-jar", "/app/tripster_user_ms.jar"]