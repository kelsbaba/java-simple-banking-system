![Java](https://img.shields.io/badge/Java-25-orange)
![Maven](https://img.shields.io/badge/Maven-3-blue)
![JUnit](https://img.shields.io/badge/JUnit-5-green)
![Git](https://img.shields.io/badge/Git-Version_Control-red)

# Java Simple Banking System

A console-based banking application built with Java using Object-Oriented Programming (OOP) principles. This project demonstrates customer management, transaction processing, exception handling, unit testing with JUnit 5, and Maven project organization.

## Table of Contents

- [Features](#features)
- [Project Structure](#project-structure)
- [Getting Started](#getting-started)
- [Running the Application](#running-the-application)
- [Running the Tests](#running-the-tests)
- [Technologies Used](#technologies-used)
- [Future Improvements](#future-improvements)
- [Author](#author)
## Features

- Add new customers
- Prevent duplicate customer creation
- Deposit money into customer accounts
- Withdraw money from customer accounts
- View customer transaction history
- Calculate customer balances
- Exception handling for invalid operations
- Unit testing with JUnit 5
## Technologies Used

- Java 25
- Maven
- JUnit 5
- Git
- IntelliJ IDEA Community Edition
## Project Structure

```
src
├── main
│   ├── java
│   │   └── com.esegine.bank
│   │       ├── app
│   │       ├── exception
│   │       ├── model
│   │       ├── service
│   │       └── util
│   └── resources
└── test
    └── java
```

## Getting Started

### Prerequisites

Before running this project, ensure you have the following installed:

- Java JDK 25 or later
- Maven
- Git
- IntelliJ IDEA (Community or Ultimate)

### Clone the Repository

```bash
git clone https://github.com/kelsbaba/java-simple-banking-system.git
```

### Navigate to the Project Folder

```bash
cd java-simple-banking-system
```

### Build the Project

```bash
mvn clean install
```

### Run the Application

Open the project in IntelliJ IDEA and run the `Main.java` class.

## Running the Tests

Run the following command from the project root:

```bash
mvn test
```

## Skills Demonstrated

- Object-Oriented Programming (OOP)
- Exception Handling
- Collections Framework
- Layered Architecture
- Maven Project Management
- Unit Testing with JUnit 5
- Version Control with Git
## Future Improvements

- Add support for account numbers
- Implement savings and current account types
- Persist data using a database
- Build a REST API with Spring Boot
- Add user authentication and authorization
- Develop a graphical or web-based user interface
## Author

**Sunday Kelly Esegine**

- GitHub: https://github.com/kelsbaba