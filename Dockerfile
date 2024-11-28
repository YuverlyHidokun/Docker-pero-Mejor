# Define la imagen base de Java
FROM eclipse-temurin:23-jdk

# Establece un directorio de trabajo dentro del contenedor
WORKDIR /app

# Copia los archivos necesarios al contenedor
COPY BMIRemoto.java /app
COPY BMIRemotoImpl.java /app
COPY ClienteRMI.java /app
COPY ServidorRMI.java /app
COPY BMIRemoto.class /app
COPY BMIRemotoImpl.class /app
COPY ClienteRMI.class /app
COPY ServidorRMI.class /app

# Expone el puerto utilizado por RMI
EXPOSE 1099

# Inicia el servidor RMI al ejecutar el contenedor
CMD ["java", "ServidorRMI"]