# Task Management API

A backend REST API for managing user tasks with authentication and authorization.

## Features
- User registration and login
- JWT authentication (access + refresh tokens)
- Task CRUD operations
- User-based task ownership
- Pagination and sorting
- Global error handling
- Input validation

## Tech Stack
- Java
- Spring Boot
- Spring Security
- Spring Data JPA
- PostgreSQL
- JWT
- Maven

## API Endpoints (Example)
- POST /api/auth/register
- POST /api/auth/login
- POST /api/tasks
- GET /api/tasks
- PUT /api/tasks/{id}
- DELETE /api/tasks/{id}

## Getting Started

### Prerequisites
- Java 21+
- Maven
- PostgreSQL

### Running Locally
1. Clone the repository
   ```bash
   git clone https://github.com/YOUR_USERNAME/task-management-api.git
