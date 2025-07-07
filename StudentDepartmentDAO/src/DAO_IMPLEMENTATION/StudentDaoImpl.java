package DAO_IMPLEMENTATION;

import DAO.StudentDao;
import DATABASE.DB_Connection;
import Model.Department;
import Model.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {

    Connection conn = DB_Connection.getDbConnection();
    DepartmentDaoImpl departmentDao = new DepartmentDaoImpl();

    @Override
    public void addStudent(Student student) {
        try {
            String sql = "INSERT INTO students (student_id, student_name, roll_number, dept_id) VALUES (?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, student.getStudentId());
            stmt.setString(2, student.getName());
            stmt.setString(3, student.getRollNumber());
            stmt.setInt(4, student.getDepartment().getDeptId());
            stmt.executeUpdate();
            System.out.println("✅ Student Added!");
        } catch (Exception e) {
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
                System.out.println("Student Deleted!");
            } else {
                System.out.println("Student Not Found!");
            }
        } catch (Exception e) {
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

                Department dept = departmentDao.getDepartmentById(rs.getInt("dept_id"));
                s.setDepartment(dept);

                list.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
