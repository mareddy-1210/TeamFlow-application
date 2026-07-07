# TeamFlow Application - Architecture and Design Decisions

## Project Overview

TeamFlow Application is a Spring Boot REST API developed for managing team projects and tasks. The application enables users to create projects, manage tasks, track task dependencies, perform Root Cause Analysis (RCA), add comments, manage reviews, and receive notifications.

The application follows a layered architecture using Spring Boot, Spring Data JPA, and PostgreSQL.

---

## Architecture

The application is designed using a layered architecture consisting of the following layers:

### Controller Layer
- Handles HTTP requests from clients.
- Exposes REST API endpoints.
- Passes requests to the Service layer.

### Service Layer
- Contains the business logic.
- Validates and processes application data.
- Communicates with the Repository layer.

### Repository Layer
- Uses Spring Data JPA.
- Performs CRUD operations on the PostgreSQL database.
- Reduces the need to write SQL queries manually.

### Database Layer
- PostgreSQL is used as the relational database.
- Hibernate automatically creates and updates database tables using JPA entities.

---

## Technology Choices

### Spring Boot
Spring Boot was selected because it simplifies REST API development and provides built-in dependency injection and configuration.

### Spring Data JPA
Spring Data JPA simplifies database interaction by providing repository interfaces for CRUD operations.

### PostgreSQL
PostgreSQL was chosen because it is an open-source, reliable, and scalable relational database.

### Thunder Client
Thunder Client was used to test REST API endpoints including GET, POST, PUT, and DELETE requests during development.

---

## Database Design

The application contains the following entities:

- User
- Project
- Task
- Comment
- Review
- RCA
- Notification
- TaskRelation

Relationships between these entities are represented in the ER Diagram included in the repository.

---

## Design Decisions

The following design decisions were made during implementation:

- Used layered architecture for better separation of responsibilities.
- Used RESTful APIs for communication between client and server.
- Used Spring Data JPA for object-relational mapping.
- Used PostgreSQL as the backend database.
- Used Hibernate to automatically manage the database schema.
- Used foreign key relationships to maintain data integrity.

---

## Scalability

The application can be extended in the future by adding authentication, authorization, dashboards, reporting features, and a frontend interface without major architectural changes.

---

## Conclusion

The TeamFlow Application demonstrates a clean, modular, and maintainable backend architecture using Spring Boot, Spring Data JPA, and PostgreSQL. The chosen architecture makes the project easy to understand, maintain, and extend.
