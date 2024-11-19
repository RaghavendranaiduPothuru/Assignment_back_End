package main.java.curd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    // JDBC URL, username, and password for MySQL
    private static final String URL = "jdbc:mysql://localhost:3306/RegistrationDB";
    private static final String USER = "root"; // Replace with your MySQL username
    private static final String PASSWORD = "raghu"; // Replace with your MySQL password

    // Establishes a connection to the database
    public static Connection getConnection() throws SQLException {
        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println("MySQL JDBC Driver not found. Ensure you have added it to your project's dependencies.");
            e.printStackTrace();
            throw new SQLException("Unable to load MySQL JDBC Driver");
        }

        // Return the database connection
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}