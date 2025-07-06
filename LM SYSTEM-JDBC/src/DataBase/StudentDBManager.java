package DataBase;

import Model.Student;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class StudentDBManager {
    Connection conn = DBConnection.getDbConnection();

    public void addStudent(Student student) {
        try {
            String sql = "INSERT INTO students (student_id, name, roll_number) VALUES (?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, student.getStudentId());
            stmt.setString(2, student.getName());
            stmt.setString(3, student.getRollNumber());
            stmt.executeUpdate();
            System.out.println("Student added successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void deleteStudent(int student_id) {
        try {
            String sql = "DELETE FROM  students WHERE student_id= ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, student_id);
            int rowAffected = stmt.executeUpdate();
            if (rowAffected > 0) {
                System.out.println("Student deleted Successfully!");
            } else
                System.out.println("No department found with ID: " + student_id);

        } catch (Exception e) {
            e.printStackTrace();
        }
}
}
