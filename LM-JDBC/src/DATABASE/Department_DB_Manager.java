package DATABASE;

import Model.Department;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Department_DB_Manager {

    Connection conn = DB_Connection.getDbConnection();

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

    public void deleteDepartment(int dept_id) {
        try {
            String sql = "DELETE FROM departments WHERE dept_id = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, dept_id);
            int rowAffected = stmt.executeUpdate();
            if (rowAffected > 0) {
                System.out.println("Department deleted Successfully!");
            } else {
                System.out.println("No department found with ID: " + dept_id);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Department> getAllDepartments() {
        List<Department> departments = new ArrayList<>();
        try {
            String sql = "SELECT * FROM departments";
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            System.out.println("---- Department List ----");
            while (rs.next()) {
                int id = rs.getInt("dept_id");
                String name = rs.getString("dept_name");
                String deptCode = rs.getString("dept_code");

                Department department = new Department(id, name, deptCode);
                departments.add(department);
                System.out.println(department);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return departments;
    }

    public Department getDepartmentById(int departmentId) {
        Department department = null;
        try {
            Statement statement = conn.createStatement();
            String select = "SELECT * FROM departments WHERE dept_id = " + departmentId;
            ResultSet resultSet = statement.executeQuery(select);

            if (resultSet.next()) {
                department = new Department();
                department.setDeptId(resultSet.getInt("dept_id"));
                department.setDeptName(resultSet.getString("dept_name"));
                department.setDeptCode(resultSet.getString("dept_code"));
            } else {
                System.out.println("No Department found with ID: " + departmentId);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return department;
    }
}
