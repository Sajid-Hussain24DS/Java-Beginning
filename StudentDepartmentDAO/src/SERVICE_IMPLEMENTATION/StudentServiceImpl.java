package SERVICE_IMPLEMENTATION;

import DAO.StudentDao;
import DAO_IMPLEMENTATION.StudentDaoImpl;
import Model.Student;
import SERVICE.StudentService;

import java.util.List;

public class StudentServiceImpl implements StudentService {

    StudentDao studentDao = new StudentDaoImpl();

    @Override
    public void addStudent(Student student) {
        studentDao.addStudent(student);
    }

    @Override
    public void deleteStudent(int studentId) {
        studentDao.deleteStudent(studentId);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentDao.getAllStudents();
    }
}
