# SecureBank API

A secure banking backend API built using **Java 21** and **Spring Boot**. This project demonstrates modern backend development practices with a strong focus on **security**, **authentication**, and **clean architecture**.

## Project Goals

The aim of this project is to simulate a real-world banking system where users can securely:

* Register and authenticate using JWT
* Manage bank accounts
* Transfer money between accounts
* View transaction history
* Access features based on roles and permissions
* Interact with well-documented REST APIs

## Tech Stack

* Java 21
* Spring Boot 3
* Spring Security
* JWT Authentication
* Spring Data JPA / Hibernate
* PostgreSQL
* Maven
* Lombok
* Validation API
* Swagger / OpenAPI
* Docker (planned)

## Project Roadmap

### Phase 1 – Foundation

* [x] Create Spring Boot project
* [x] Configure Maven
* [x] Set up Git and GitHub repository
* [x] Create health check endpoint

### Phase 2 – Database Layer

* [ ] Configure PostgreSQL
* [ ] Create User entity
* [ ] Create repositories
* [ ] Configure database migrations

### Phase 3 – Authentication

* [ ] User registration endpoint
* [ ] Login endpoint
* [ ] Password encryption using BCrypt
* [ ] JWT generation and validation

### Phase 4 – Authorisation

* [ ] Implement Role-Based Access Control (RBAC)
* [ ] Define CUSTOMER and ADMIN roles
* [ ] Secure API endpoints

### Phase 5 – Banking Features

* [ ] Create bank accounts
* [ ] Deposit funds
* [ ] Withdraw funds
* [ ] Transfer money between accounts
* [ ] View transaction history

### Phase 6 – Production Readiness

* [ ] Swagger/OpenAPI documentation
* [ ] Docker containerisation
* [ ] Unit and integration testing
* [ ] CI/CD pipeline
* [ ] Deployment to cloud infrastructure

## Learning Objectives

This project has been designed to strengthen skills in:

* Secure API development
* Spring Security
* Java backend architecture
* Database design with JPA
* Authentication and authorisation patterns
* DevOps fundamentals

## Status

🚧 Currently under active development.
