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
        try {
            if (student == null || student.getDepartment() == null) {
                System.out.println("Invalid student or department.");
                return;
            }

            String sql = "INSERT INTO students (student_name, roll_number, dept_id) VALUES (?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

            stmt.setString(1, student.getName());
            stmt.setString(2, student.getRollNumber());
            stmt.setInt(3, student.getDepartment().getDeptId());  // ✅ FIXED: get dept ID

            stmt.executeUpdate();
            System.out.println("✅ Student Added Successfully!");
        } catch (SQLException e) {
            System.out.println("❌ Error adding student:");
            e.printStackTrace();
        }
    }

    @Override
    public void deleteStudent(int studentId) {
        try {
            String sql = "DELETE FROM students WHERE student_id = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, studentId);

            int rows = stmt.executeUpdate();
            if (rows > 0) {
                System.out.println("✅ Student Deleted!");
            } else {
                System.out.println("⚠️ Student Not Found!");
            }
        } catch (SQLException e) {
            System.out.println("❌ Error deleting student:");
            e.printStackTrace();
        }
    }

    @Override
    public List<Student> getAllStudents() {
        List<Student> list = new ArrayList<>();
        try {
            String sql = "SELECT * FROM students";
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Student s = new Student();
                s.setStudentId(rs.getInt("student_id"));
                s.setName(rs.getString("student_name"));
                s.setRollNumber(rs.getString("roll_number"));

                int deptId = rs.getInt("dept_id");
                Department dept = departmentDao.getDepartmentById(deptId);
                s.setDepartment(dept);  // ✅ FIXED

                list.add(s);
            }
        } catch (SQLException e) {
            System.out.println("❌ Error fetching students:");
            e.printStackTrace();
        }
        return list;
    }

    // ✅ If you use this method in your code elsewhere, now it's fully supported
    @Override
    public boolean insertStudent(Student student) {
        try {
            String sql = "INSERT INTO students (student_name, roll_number, dept_id) VALUES (?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
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
