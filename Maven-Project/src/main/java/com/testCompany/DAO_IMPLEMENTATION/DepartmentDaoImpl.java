package com.testCompany.DAO_IMPLEMENTATION;

import com.testCompany.DAO.DepartmentDao;
import com.testCompany.DATABASE.*;
import com.testCompany.Model.Department;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DepartmentDaoImpl implements DepartmentDao {

    Connection conn = DB_Connection.getDbConnection();

    @Override
    public void addDepartment(Department department) {
        try {
            String sql = "INSERT INTO departments (dept_id, dept_name, dept_code) VALUES (?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, department.getDeptId());
            stmt.setString(2, department.getDeptName());
            stmt.setString(3, department.getDeptCode());
            stmt.executeUpdate();
            System.out.println("Department Added!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteDepartment(int deptId) {
        try {
            String sql = "DELETE FROM departments WHERE dept_id = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, deptId);
            int rows = stmt.executeUpdate();
            if (rows > 0) {
                System.out.println("Department Deleted!");
            } else {
                System.out.println("Department Not Found!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Department> getAllDepartments() {
        List<Department> list = new ArrayList<>();
        try {
            String sql = "SELECT * FROM departments";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Department d = new Department();
                d.setDeptId(rs.getInt("dept_id"));
                d.setDeptName(rs.getString("dept_name"));
                d.setDeptCode(rs.getString("dept_code"));
                list.add(d);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public Department getDepartmentById(int deptId) {
        Department d = null;
        try {
            String sql = "SELECT * FROM departments WHERE dept_id = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, deptId);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                d = new Department();
                d.setDeptId(rs.getInt("dept_id"));
                d.setDeptName(rs.getString("dept_name"));
                d.setDeptCode(rs.getString("dept_code"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return d;
    }
}
