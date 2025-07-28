package serviceImpl;

import  DAO.DepartmentDao;
import daoImpl.DepartmentDaoImpl;
import  Model.Department;
import  Service.DepartmentService;

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
