# Authentication Service

![Spring Boot](https://img.shields.io/badge/Spring%20Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)
![Hibernate](https://img.shields.io/badge/Hibernate-59666C?style=for-the-badge&logo=hibernate&logoColor=white)
![MySQL](https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=mysql&logoColor=white)
![JWT](https://img.shields.io/badge/JWT-000000?style=for-the-badge&logo=json-web-tokens&logoColor=white)

## Overview
This Authentication Service is a Spring Boot application that provides token generation and validation using JWT (JSON Web Token). It does not include user authentication logic, filters, or security configuration. These must be implemented by the users of this project.

## Features
- Generates JWT tokens for authentication
- Validates JWT tokens
- Lightweight and easy to integrate with other Spring Boot applications

## Technologies Used
- **Spring Boot** - For building the backend service
- **Hibernate JPA** - For ORM (Object Relational Mapping)
- **MySQL** - As the database
- **JWT** - For secure token-based authentication

## Installation
1. Clone the repository:
   ```sh
   git clone (https://github.com/NikhilKashyap22/Centralised-Authentication-System.git)
   ```
2. Navigate to the project directory:
   ```sh
   cd authentication-service
   ```
3. Build the project using Maven:
   ```sh
   mvn clean install
   ```
4. Run the application:
   ```sh
   mvn spring-boot:run
   ```

## Usage
### Generate Token
To generate a JWT token, send a `POST` request to:
```http
POST /api/auth/token
```
with the required payload.

### Validate Token
To validate a JWT token, send a `POST` request to:
```http
POST /api/auth/validate
```
with the token in the request body.

## Important Notes
- This project **only** generates and validates JWT tokens.
- Filters and security configuration are **not** included and must be implemented separately.
- Users must handle authentication, user management, and security filters in their own application.

## Configuration
Update the `application.properties` file with your MySQL configuration:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/auth_db
spring.datasource.username=root
spring.datasource.password=yourpassword
```

## License
This project is open-source and available under the MIT License.

---
Made with ❤️ using Spring Boot, Hibernate, MySQL, and JWT.

