package DATABASE;

import Model.StudentDepartment;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Student_Department_Manager {

    Connection conn = DB_Connection.getDbConnection();

    public List<StudentDepartment> getAllStudentWithNameAndDept() {
        List<StudentDepartment> studentDepartments = new ArrayList<>();

        try {
            Statement statement = conn.createStatement();
            String getAllStudents = "SELECT s.student_name, d.dept_name " +
                    "FROM students s " +
                    "INNER JOIN departments d ON s.dept_id = d.dept_id";
            ResultSet rs = statement.executeQuery(getAllStudents);

            while (rs.next()) {
                String name = rs.getString("student_name");
                String deptName = rs.getString("dept_name");

                StudentDepartment sd = new StudentDepartment();
                sd.setStudentName(name);
                sd.setDeptName(deptName);

                studentDepartments.add(sd);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return studentDepartments;
    }
}
