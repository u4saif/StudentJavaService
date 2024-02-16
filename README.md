# Project Student Service 

This is a Spring Boot project with the following dependencies:

- Spring Boot Starter Web: For creating web applications.
- Spring Boot Starter Data JPA: For database access using Java Persistence API.
- MySQL Connector Java: For connecting to MySQL databases.
- Spring Boot Devtools: For automatic restart and live reload during development.
- Spring Boot Starter Test: For testing Spring Boot applications.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

- Java 8 or higher
- Maven
- MySQL

### Steps to create the project

1. Create a new Spring Boot project in your IDE (e.g., Spring Tool Suite, IntelliJ IDEA).
2. Open the `pom.xml` file and add the above dependencies.
3. Configure your MySQL database connection in `application.properties` or `application.yml`.
4. Create your application logic.
5. Run your application.

## Running the tests

To run the tests, use the following command in your terminal:

```bash
mvn test