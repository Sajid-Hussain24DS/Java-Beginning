package DAO;

import Model.Department;
import java.util.List;

public interface DepartmentDao {
   void addDepartment(Department department);
    void deleteDepartment(int deptId);
    List<Department> getAllDepartments();
    Department getDepartmentById(int deptId);
     

}
