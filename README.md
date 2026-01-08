# Proyecto Final – Seguridad y Roles con Spring Boot
// Descripción general
Este proyecto corresponde al Proyecto Final de la asignatura *Lenguajes de Programación III*, cuyo objetivo es implementar seguridad, autenticación y autorización basada en roles en una aplicación desarrollada con **Spring Boot**.
El sistema permite el acceso a distintas secciones según el rol asignado a cada usuario, garantizando que solo los usuarios autorizados puedan acceder a determinadas rutas del sistema.

// Objetivo del proyecto
Implementar un mecanismo de seguridad que:
- Controle el acceso mediante autenticación de usuarios.
- Restrinja las rutas según roles definidos.
- Proteja la aplicación frente a accesos no autorizados.
- Aplique buenas prácticas básicas de seguridad en aplicaciones web.

// Roles implementados
El sistema maneja los siguientes roles:
- **ROLE_ADMIN** → Acceso total al sistema.
- **ROLE_EMPLEADO** → Acceso a secciones de empleado y cliente.
- **ROLE_CLIENTE** → Acceso únicamente a la sección de cliente.

// Usuarios de prueba
Para fines académicos y de validación del sistema, se configuraron los siguientes usuarios de prueba:
- **admin / admin123** → Rol ADMIN  
- **empleado / emp123** → Rol EMPLEADO  
- **cliente / cli123** → Rol CLIENTE  
Estos usuarios permiten verificar el correcto funcionamiento de la autenticación y la restricción de accesos según el rol asignado.

// Autor - Dario Herrera
