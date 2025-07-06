package DataBase;

import Model.Student;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

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
    public List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();
        try {
            String sql = "SELECT * FROM students";
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            System.out.println("---- Student List ----");
            while (rs.next()) {
                int id = rs.getInt("student_id");
                String name = rs.getString("student_name");
                String rollNumber = rs.getString("roll_number");


                Student student = new Student(id, name, rollNumber);
                students.add(student);
                System.out.println(student);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return students;
    }

}

