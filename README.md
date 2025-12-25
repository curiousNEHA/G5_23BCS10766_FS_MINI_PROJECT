
# Student Course Registration REST API (With Spring Security)

---

## Project Overview

This mini project is a secure RESTful backend application developed using Spring Boot and Spring Security. The system allows users to register and log in, and after successful authentication, perform student course registration operations. The project focuses on implementing proper authentication, authorization, validation, and REST API design principles.

---

## Objective

The objective of this project is to build a secure backend service that manages student course registrations. Public endpoints are provided for user registration and login, while all student-related APIs are protected using Spring Security to ensure restricted access.

---

## Student Model

The Student entity consists of the following attributes:

* id (int): Unique identifier for each student
* name (String): Name of the student
* course (String): Course registered by the student

---

## Security Implementation

The application uses Spring Security to handle authentication and authorization with the following features:

* User registration and login endpoints are publicly accessible
* New users can register without authentication
* Login endpoint authenticates users and generates a security token
* All student-related APIs require authentication
* Unauthorized access to secured APIs is restricted

---

## Authentication APIs (Public Access)

### Register User

Endpoint:
POST /auth/register

Description:
Allows new users to create an account without authentication.

---

### Login User

Endpoint:
POST /auth/login

Description:
Accepts username and password in JSON format and returns an authentication token upon successful login.

Responses:

* 200 OK – Login successful
* 401 UNAUTHORIZED – Invalid credentials

---

## Student APIs (Secured)

### Register Student

Endpoint:
POST /students

Validations:

* Student name and course must not be null or empty
* Student ID must be unique

Responses:

* 201 CREATED – Student registered successfully
* 400 BAD REQUEST – Validation failed
* 409 CONFLICT – Duplicate student ID

---

### Get All Students

Endpoint:
GET /students

Description:
Returns a list of all registered students. If no students are available, an empty list is returned.

Response:

* 200 OK

---

### Get Student by ID

Endpoint:
GET /students/{id}

Responses:

* 200 OK – Student found
* 404 NOT FOUND – Student not found

---

### Delete Student

Endpoint:
DELETE /students/{id}

Responses:

* 200 OK – Student deleted successfully
* 404 NOT FOUND – Student does not exist

---

## Technologies Used

* Java
* Spring Boot
* Spring Security
* RESTful APIs
* Maven

---

## How to Run the Project

1. Clone the repository from GitHub
2. Open the project in IntelliJ IDEA or Eclipse
3. Configure application properties if required
4. Run the Spring Boot application
5. Test the APIs using Postman or similar tools

---

## Learning Outcomes

* Understanding REST API development using Spring Boot
* Implementing authentication and authorization with Spring Security
* Securing APIs using tokens
* Applying validations and proper HTTP status codes
* Designing a structured backend application

---

## Author

Neha Sharma
Mini Project – Student Course Registration REST API

