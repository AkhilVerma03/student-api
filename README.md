# student-api

Spring Boot REST API for managing students. Built with JPA and PostgreSQL.

## Endpoints

| Method | URL | Description |
|--------|-----|-------------|
| GET | /students | Get all students |
| GET | /students/{id} | Get student by ID |
| POST | /students | Create a student |

## Stack

- Java 21
- Spring Boot 3
- Spring Data JPA
- PostgreSQL
- Lombok

## Run Locally

1. Create a PostgreSQL database named `studentdb`
2. Update `application.properties` with your DB credentials
3. Run:

```bash
./mvnw spring-boot:run
```

API runs at `http://localhost:8080`
