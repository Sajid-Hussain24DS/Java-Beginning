package database;

import model.Department;

import java.sql.Connection;
import java.sql.Statement;

public class DepartmentDbManager {
    Connection connection = DBConnection.getDbConnection();

    public void addDepartment(Department department) {
        try {
            Statement statement = connection.createStatement();

            String insert = "INSERT INTO departments(name, dept_code) VALUES ('"
                    + department.getDeptName() + "', '" + department.getDeptCode() + "')";

            int rows = statement.executeUpdate(insert);

            if (rows > 0) {
                System.out.println("Department added successfully");
            } else {
                System.out.println("Error occurred while adding Department");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
