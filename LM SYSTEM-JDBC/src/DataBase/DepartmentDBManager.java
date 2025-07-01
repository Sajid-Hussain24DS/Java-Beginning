package DataBase;

import Model.Department;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class DepartmentDBManager {
    Connection conn = DBConnection.getDbConnection();

    public void addDepartment(Department department) {
        try {
            String sql = "INSERT INTO departments (dept_id, dept_name, dept_code) VALUES (?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, department.getDeptId());
            stmt.setString(2, department.getDeptName());
            stmt.setString(3, department.getDeptCode());
            stmt.executeUpdate();
            System.out.println("Department added successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
