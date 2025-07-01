package DB;

import java.sql.*;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // PostgreSQL JDBC URL -> dbname include karo directly
        String jdbcUrl = "jdbc:postgresql://localhost:5432/campus_db"; // apna DB ka naam yahan
        String username = "postgres";
        String password = "Postgres@123";

        Scanner sc = null;

        try {
            // 1️⃣ Connect to PostgreSQL database directly
            Connection con = DriverManager.getConnection(jdbcUrl, username, password);
            System.out.println("Connection successful!");

            Statement stat = con.createStatement();

            sc = new Scanner(System.in);

            // User input
            System.out.print("Enter department id to update/delete: ");
            int departmentId = sc.nextInt();
            sc.nextLine(); // consume newline

            System.out.print("Enter department name to insert: ");
            String departmentName = sc.nextLine();

            System.out.print("Enter department code to insert/update: ");
            String departmentCode = sc.nextLine();

            // SQL queries
            String insert = "INSERT INTO departments(name, dept_code) VALUES (?, ?)";
            String update = "UPDATE departments SET dept_code=? WHERE dept_id=?";
            String delete = "DELETE FROM departments WHERE dept_id=?";

            PreparedStatement pstmt;

            // 🔵 Uncomment the operation you want:

            // Insert
            /*
            pstmt = con.prepareStatement(insert);
            pstmt.setString(1, departmentName);
            pstmt.setString(2, departmentCode);
            pstmt.executeUpdate();
            System.out.println("Data inserted successfully");
            */

            // Update
            /*
            pstmt = con.prepareStatement(update);
            pstmt.setString(1, departmentCode);
            pstmt.setInt(2, departmentId);
            pstmt.executeUpdate();
            System.out.println("Data updated successfully");
            */

            // Delete
            /*
            pstmt = con.prepareStatement(delete);
            pstmt.setInt(1, departmentId);
            pstmt.executeUpdate();
            System.out.println("Data deleted successfully");
            */

            // Show all records
            String query = "SELECT * FROM departments";
            ResultSet rs = stat.executeQuery(query);

            System.out.println("\nDepartment Records:");
            System.out.println("------------------");
            while (rs.next()) {
                int id = rs.getInt("dept_id");
                String name = rs.getString("name");
                String code = rs.getString("dept_code");

                System.out.println("Dept ID: " + id);
                System.out.println("Dept Name: " + name);
                System.out.println("Dept Code: " + code);
                System.out.println("------------------");
            }

            rs.close();
            stat.close();
            con.close();

        } catch (SQLException e) {
            System.err.println("SQL Error: " + e.getMessage());
            e.printStackTrace();
        } finally {
            if (sc != null) {
                sc.close();
            }
        }
    }
}
