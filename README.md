# TareaLibro
Web API de Libro
En este repositorio se encuentra un proyecto, inicializado mediante la tecnogolia "Spring Initializer"
Con una clase "Libro" con los campos "Id","titulo","autor","editorial" y "anioPublicacion"

# Estructura
- Models: Donde se almacena nuestra clase creada 'Libro.'
- Repository: Donde se almacena de manera estatica la información que sera usada para la ejecución del proyecto.
- Services: Donde se almacenan los servicios que se ejecutaran en el proyecto.
- Controllers: Donde se almacenan los controlador con los que pondremos en acción nuestros servicios.

# Funcionamiento:
Tiene tres funcionalidades principales:

 - Consultar la lista de libros: Mediante una solicitud Get, nos muestra los libros almacenados en nuestro repositorio.
 - Buscar un libro: A través de una búsqueda Get de id, se solicita un libro en especifico.
 - Agregar libro: Por medio de una solicitud Post, se agrega (aunque de manera temporal al no contar con una base de datos) un nuevo libro con todas sus caracteristicas pertinentes.

# Ejecución 
  - Consulta general:
!(libro/src/main/java/com/tarea/libro/image/Prueba PostMan Get Libros.jpeg)
