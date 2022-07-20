# Ejemplo implementación de un webhook
### 20/07/2022

El siguiente ejemplo está hecho utilizando SpringBoot como plataforma para la ejecución. 
El objetivo es crear un servicio que reciba cualquier información de forma simple.
La clase RegistroRecargaController implementa 2 métodos:

### GET
Este evento sirve para realizar pruebas de conexión, es la página de bienvenida. 
A través de este se podrá gestionar pruebas de conexión entre sistemas y redes.
### POST
Este evento toma cualquier información que le llegue en el cuerpo.

### Pasos para ejecutar la prueba
Una vez descargado el código, se puede ejecutar el proyecto utilizando Maven de la siguente forma:

- mvn spring-boot:run

