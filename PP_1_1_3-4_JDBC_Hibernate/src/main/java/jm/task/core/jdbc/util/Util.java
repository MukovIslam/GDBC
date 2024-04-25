package jm.task.core.jdbc.util;//package jm.task.core.jdbc.util;

import java.sql.*;

public class Util {
    // public static void main(String[] args) throws ClassNotFoundException, SQLException {
    // реализуйте настройку соеденени
    static String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
    static String DB_URL = "jdbc:mysql://localhost:3306/mydbtest";
    static String DB_USERNAME = "root";
    static String DB_PASSWORD = "PerformancE07!";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName(DB_DRIVER);
            connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            if (!connection.isClosed()) {
            }
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }

}
