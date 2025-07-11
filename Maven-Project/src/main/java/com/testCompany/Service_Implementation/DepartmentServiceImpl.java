package com.testCompany.Service_Implementation;

import com.testCompany.DAO.DepartmentDao;
import com.testCompany.DAO_IMPLEMENTATION.DepartmentDaoImpl;
import com.testCompany.Model.Department;
import com.testCompany.Service.DepartmentService;

import java.util.List;

public class DepartmentServiceImpl implements DepartmentService {
    DepartmentDao departmentDao = new DepartmentDaoImpl();

    @Override
    public void addDepartment(Department department) {
        departmentDao.addDepartment(department);
    }

    @Override
    public void deleteDepartment(int deptId) {
        departmentDao.deleteDepartment(deptId);
    }

    @Override
    public List<Department> getAllDepartments() {
        return departmentDao.getAllDepartments();
    }
}
