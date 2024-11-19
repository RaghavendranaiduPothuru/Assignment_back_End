**Registration**

This project consists of a Java-based backend connected to a MySQL database. Follow the instructions below to set up and run the backend locally on your machine.

Prerequisites

Make sure the following software is installed:

Java JDK

MySQL

A code editor such as Eclipse


**Backend Setup**

1. Clone the repository

Clone the project repository to your local machine:

git clone <repository-url>
cd <backend-folder>

2. Install MySQL and set up the database

Ensure MySQL is installed and running on your machine. Then, set up the database:

1. Log in to MySQL:

mysql -u root -p


2. Create a new database for the project:

CREATE DATABASE project_db;


3. Exit MySQL:



4. Update your MySQL connection credentials in the project configuration file (e.g., application.properties or application.yml) with your database information:

spring.datasource.url=jdbc:mysql://localhost:3306/project_db
spring.datasource.username=root
spring.datasource.password=your_password



3. Run the Java backend server

Once the dependencies are installed, you can run the backend server using Maven or your IDE.

4. Test the backend

Once the application is running, the backend server should be accessible at http://localhost:8080 (or the port defined in your application properties).

You can test your backend by sending requests via Postman or cURL, depending on your API setup.

Troubleshooting

Database connection issues: Ensure that MySQL is running and that your database credentials in the configuration file are correct.






