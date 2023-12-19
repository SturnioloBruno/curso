# Proyecto CursoRest

Este proyecto es una aplicación Spring Boot que proporciona una API REST para gestionar estudiantes. La documentación de la API está disponible a través de Swagger.

## Instrucciones para Deployment en Play With Docker

1. **Acceder a Play With Docker:**
   Visita [Play With Docker](https://labs.play-with-docker.com/). Regístrate si es necesario (esto es necesario para ver el despliegue de una BD y un servidor backend).

2. **Descargar la Imagen Docker desde Docker Hub:**
   ```bash
   docker pull brunosturniolo/cursorest


3. **Ejecutar el Contenedor en Play With Docker**
    ```bash
    docker run -p 80:8080 brunosturniolo/cursorest

4. **OPEN PORT**
en la pagina de play with docker, darle click en openport para poder ver el servidor, elegir el 80, y automaticamente te
abrira una pestaña con el url(tu-ip-play-with-docker) de tu servidor levantado, ahora puedes ejecutar pruebas desde postman o swagger:

Swagger-UI:Accede a la documentación de la API utilizando Swagger-UI en: http://tu-ip-play-with-docker/swagger-ui/index.html#/
(recuerda cambiar tu-ip-play-with-docker, por la que te dé play with docker, se debe ver algo asi: 
http://ip172-18-0-99-cm0pkics9otg00e6eu00-80.direct.labs.play-with-docker.com/swagger-ui/index.html#/)

Archivo de Colección de Postman:Descarga la colección de Postman desde ./resources/CursoRest.postman_collection.json para probar la API.
