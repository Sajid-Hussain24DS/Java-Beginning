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
}
