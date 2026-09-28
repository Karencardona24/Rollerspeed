# Roller Speed

Proyecto académico desarrollado para la escuela de patinaje **Roller Speed** como parte de las evidencias de aprendizaje del programa de Tecnología en Desarrollo de Software.

La solución se construye como una aplicación web monolítica utilizando **Spring Boot**, **Spring MVC**, **Thymeleaf**, **Spring Data JPA**, **PostgreSQL**, **Git** y **GitHub**.

El proyecto se ha desarrollado de manera incremental a través de varias evidencias de aprendizaje, evolucionando desde la configuración inicial del entorno hasta la implementación de controladores, vistas dinámicas y una API REST documentada con Swagger/OpenAPI.

---

# 1. Descripción del proyecto

Roller Speed es una escuela de patinaje que requiere mejorar la gestión de sus procesos administrativos y deportivos.

El sistema busca apoyar procesos relacionados con:

- Aspirantes.
- Alumnos.
- Instructores.
- Clases.
- Pagos.
- Asistencia.
- Información institucional.
- Servicios.
- Eventos.

Dentro del alcance inicial también se contempla la divulgación de información institucional como:

- Misión.
- Visión.
- Valores.
- Servicios.
- Eventos de la escuela.

El proyecto se desarrolla mediante una arquitectura monolítica basada en Spring Boot y el patrón MVC.

---

# 2. Objetivo general

Desarrollar progresivamente una aplicación web para Roller Speed que permita centralizar información institucional y sentar las bases para la futura gestión de alumnos, instructores, clases, pagos, asistencia y demás procesos de la escuela.

---

# 3. Tecnologías utilizadas

## Backend

- Java 17
- Spring Boot
- Spring MVC
- Spring Data JPA
- Maven

## Frontend

- Thymeleaf
- HTML5
- Bootstrap 5

## Base de datos

- PostgreSQL

## Documentación API

- Swagger
- OpenAPI
- Springdoc OpenAPI

## Control de versiones

- Git
- GitHub

## Entorno de desarrollo

- Visual Studio Code

---

# 4. Arquitectura general

La aplicación utiliza una arquitectura monolítica basada en Spring Boot.

El flujo principal de las vistas web es:

```text
Usuario
   ↓
Navegador
   ↓
Solicitud HTTP
   ↓
Spring MVC Controller
   ↓
Model
   ↓
Thymeleaf
   ↓
Vista HTML