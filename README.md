# Transaction Management POC
This repository contains a small Proof of Concept (POC) project demonstrating transaction management in a Java application using Spring's @Transactional annotation.

## Overview
The addEmployees() method in the EmployeeService class simulates adding employees to a database. It uses a list of Employee objects and attempts to save them to the database. However, it intentionally throws an exception after saving a few employees to demonstrate transaction rollback behavior.

## Requirements
To run this project, you need:

1. Java JDK (version 8 or higher)
2. Apache Maven
3. An IDE (such as IntelliJ IDEA or Eclipse) with Maven support
4. A MySQL database (or another database supported by Spring Data JPA)

## Setup
1. Clone this repository to your local machine.
2. Import the project into your IDE.
3. Configure your database connection in application.properties.
4. Build the project using Maven: mvn clean install.
5. Run the application.

## Usage
1. Run the application.
2. Access the application through the specified endpoints (e.g., REST API endpoints or UI).
3. Trigger the addEmployees() method to test transaction rollback behavior.
