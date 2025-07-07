package SERVICE_IMPLEMENTATION;

import DAO.DepartmentDao;
import DAO_IMPLEMENTATION.DepartmentDaoImpl;
import Model.Department;
import SERVICE.DepartmentService;

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
