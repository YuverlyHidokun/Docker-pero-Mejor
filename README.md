# Prueba Bimestral: Desarrollo de Aplicaciones Móviles 📝

> *Creadores*:
[@YuverlyHidokun]
[@ErickSebastian2003]

# Descripción del Proyecto
Este proyecto consiste en el desarrollo y despliegue de un sistema Cliente-Servidor RMI utilizando contenedores Docker.
Desarrollo de un Cliente Servidor RMI con subida a Docker

# Tecnologías Utilizadas
Java 23: Versión utilizada para compilar y ejecutar el proyecto.
Docker: Para la contenedorización de la aplicación.

# Requisitos Previos
Asegúrate de tener instalados en tu máquina:

Docker: Guía de instalación
Java 23 (compatible con el entorno de desarrollo).
Contenido : Un C/S RMI con contenedor en Docker

---

## Pasos a Seguir para ejecutar el C/S en Docker 💻

1. Para construir la imagen del contenedor
   ```bash
   docker build -t calculadora-rmi .
2. Ejecutar el servidor dentro de un contenedor con puerto mapeado
   ```bash
   docker run -d -p 1099:1099 --name servidor-rmi calculadora-rmi
3. Ejecutar el cliente dentro de otro contenedor ejecutando en la terminal
   ```bash
   docker run -it --network host calculadora-rmi java ClienteRMI 
4. Ejecucion del C/S:

![image](https://github.com/user-attachments/assets/00145381-018b-468d-b78e-54522fe88bfe)

# Notas Adicionales
Configuración del Dockerfile: Asegúrate de que el archivo Dockerfile utiliza una imagen base compatible con Java 23.
Depuración de Errores: Si encuentras problemas relacionados con versiones de Java, recompila las clases con la versión adecuada utilizando:
  ```bash
  javac --release 23 *.java
Red de Docker: La opción --network host se utiliza para garantizar que el cliente pueda acceder al servidor en el mismo host.
