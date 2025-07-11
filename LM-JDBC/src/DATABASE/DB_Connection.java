package DATABASE;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB_Connection {
        private static final String URL = "jdbc:mysql://localhost:3306/library_management";
        private static final String USER = "root";
        private static final String PASSWORD = "root";

        public static Connection getDbConnection() {
            try {
                return DriverManager.getConnection(URL, USER, PASSWORD);
            } catch (SQLException e) {
                throw new RuntimeException("Error connecting to DB", e);
            }
        }
    }


