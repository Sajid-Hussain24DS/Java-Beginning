package DATABASE;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB_Connection {
    private static final String URL = "jdbc:mysql://localhost:3306/library_management";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    private static Connection connection;

    private DB_Connection() {}

    public static Connection getDbConnection() {
        if (connection == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");  
                connection = DriverManager.getConnection(URL, USER, PASSWORD);
                System.out.println("Database Connected!");
            } catch (ClassNotFoundException | SQLException e) {
                throw new RuntimeException("Connection Error: " + e.getMessage());
            }
        }
        return connection;
    }
}
