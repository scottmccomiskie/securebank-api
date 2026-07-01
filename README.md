# 🏦 SecureBank API

An enterprise-style REST API built with **Java 21**, **Spring Boot**, **Spring Security**, and **PostgreSQL**.

This project is being developed to demonstrate backend engineering skills including authentication, security, validation, testing, and REST API design.

---

## 🚀 Tech Stack

- Java 21
- Spring Boot
- Spring Security
- Spring Data JPA
- PostgreSQL
- Maven
- BCrypt Password Hashing
- Jakarta Validation

---

## ✅ Features Completed

### Authentication
- User Registration
- User Login
- BCrypt password hashing
- Duplicate email prevention

### Validation
- Email validation
- Password validation
- Username validation
- Request validation using `@Valid`

### Error Handling
- Global Exception Handling (`@ControllerAdvice`)
- Custom Exceptions
- Clean API responses

### Database
- PostgreSQL
- Spring Data JPA
- Repository Query Methods

---

## 🚧 Features In Progress

- JWT Authentication
- Refresh Tokens
- Role Based Access Control (RBAC)
- Audit Logging
- Swagger/OpenAPI Documentation
- Unit Tests
- Integration Tests
- Docker Support

---

## 📂 Project Structure

```
src
├── controller
├── user
│   ├── User
│   ├── UserController
│   ├── UserService
│   ├── UserRepository
│   ├── RegisterRequest
│   ├── RegisterResponse
│   ├── LoginRequest
│   ├── LoginResponse
│   └── exceptions
├── config
└── resources
```

---

## 🔐 Registration Flow

```
Client
   │
POST /register
   │
RegisterRequest
   │
Validation
   │
Check Email Exists
   │
Hash Password (BCrypt)
   │
Save User
   │
RegisterResponse
```

---

## 🔑 Login Flow

```
Client
   │
POST /login
   │
LoginRequest
   │
Find User
   │
Verify Password
   │
LoginResponse
```

---

## 📚 What I've Learned

During this project I have implemented:

- DTO pattern
- Service Layer architecture
- Spring Data JPA repositories
- Custom exception hierarchy
- Global exception handling
- Password hashing with BCrypt
- Bean Validation
- REST API design

---

## 🎯 Roadmap

- [x] User Registration
- [x] Login
- [x] Validation
- [x] BCrypt
- [x] PostgreSQL
- [x] Exception Handling
- [ ] JWT Authentication
- [ ] Refresh Tokens
- [ ] RBAC
- [ ] Swagger
- [ ] Unit Testing
- [ ] Integration Testing
- [ ] Docker

---

## 👨‍💻 Author

**Scott McComiskie**

Backend Developer Portfolio Project
