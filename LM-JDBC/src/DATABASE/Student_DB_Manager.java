package DATABASE;

import Model.Department;
import Model.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Student_DB_Manager {

    Connection conn = DB_Connection.getDbConnection();
    Department_DB_Manager departmentDbManager = new Department_DB_Manager();

    // Add student with department ID
    public void addStudent(Student student) {
        try {
            String sql = "INSERT INTO students (student_id, student_name, roll_number, dept_id) VALUES (?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, student.getStudentId());
            stmt.setString(2, student.getName());
            stmt.setString(3, student.getRollNumber());
            stmt.setInt(4, student.getDepartment().getDeptId());
            stmt.executeUpdate();
            System.out.println("Student added successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Delete student by ID
    public void deleteStudent(int student_id) {
        try {
            String sql = "DELETE FROM students WHERE student_id = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, student_id);
            int rowAffected = stmt.executeUpdate();
            if (rowAffected > 0) {
                System.out.println("Student deleted successfully!");
            } else {
                System.out.println("No student found with ID: " + student_id);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Get all students with their department
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
                int deptId = rs.getInt("dept_id");

                Department department = departmentDbManager.getDepartmentById(deptId);

                Student student = new Student();
                student.setStudentId(id);
                student.setName(name);
                student.setRollNumber(rollNumber);
                student.setDepartment(department);

                students.add(student);
              //  System.out.println(student);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return students;
    }
}
