package daoImpl;

import DAO.StudentDao;
import DATABASE.DB_Connection;
import Model.Department;
import Model.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {

    private Connection conn = DB_Connection.getDbConnection();
    private DepartmentDaoImpl departmentDao = new DepartmentDaoImpl();

    @Override
     public void addStudent(Student student) {
        if (student == null || student.getDepartment() == null) {
            System.out.println("❌ Invalid student or department.");
            return;
        }

        String sql = "INSERT INTO students (student_name, roll_number, dept_id) VALUES (?, ?, ?)";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, student.getName());
            stmt.setString(2, student.getRollNumber());
            stmt.setInt(3, student.getDepartment().getDeptId());

            stmt.executeUpdate();
            System.out.println("✅ Student added successfully!");
        } catch (SQLException e) {
            System.out.println("❌ Error adding student:");
            e.printStackTrace();
        }
    }

    @Override
    public void deleteStudent(int studentId) {
        String sql = "DELETE FROM students WHERE student_id = ?";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, studentId);

            int rows = stmt.executeUpdate();
            if (rows > 0) {
                System.out.println("✅ Student deleted!");
            } else {
                System.out.println("⚠️ Student not found!");
            }
        } catch (SQLException e) {
            System.out.println("❌ Error deleting student:");
            e.printStackTrace();
        }
    }

    @Override
    public List<Student> getAllStudents() {
        List<Student> list = new ArrayList<>();
        String sql = "SELECT * FROM students";

        try (PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Student s = new Student();
                s.setStudentId(rs.getInt("student_id"));
                s.setName(rs.getString("student_name"));
                s.setRollNumber(rs.getString("roll_number"));

                int deptId = rs.getInt("dept_id");
                Department dept = departmentDao.getDepartmentById(deptId);
                s.setDepartment(dept);

                list.add(s);
            }
        } catch (SQLException e) {
            System.out.println("❌ Error fetching students:");
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public boolean insertStudent(Student student) {
        if (student == null || student.getDepartment() == null) {
            System.out.println("❌ Invalid student or department.");
            return false;
        }

        String sql = "INSERT INTO students (student_name, roll_number, dept_id) VALUES (?, ?, ?)";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, student.getName());
            stmt.setString(2, student.getRollNumber());
            stmt.setInt(3, student.getDepartment().getDeptId());

            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("❌ Error inserting student:");
            e.printStackTrace();
            return false;
        }
    }
}
