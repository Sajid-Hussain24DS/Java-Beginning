package com.testCompany.Service;

import com.testCompany.Model.Department;
import java.util.List;

public interface DepartmentService {
    void addDepartment(Department department);
    void deleteDepartment(int deptId);
    List<Department> getAllDepartments();
}
