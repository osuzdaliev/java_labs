package edu.dp.sau.osuzdaliev.lr5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/StudentsDB";
    private static final String USER = "root";
    private static final String PASSWORD = "AsdFgh";
    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            System.out.println("Error connecting to the database: " + e.getMessage());
            return null;
        }
    }
}