package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    public static Connection getDbConnection() {
        String jdbcUrl = "jdbc:mysql://localhost:3306/campus_db";
        String username = "root";  // default user, change if needed
        String password = "root";  // apna PostgreSQL password likho

        try {
            return DriverManager.getConnection(jdbcUrl, username, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
