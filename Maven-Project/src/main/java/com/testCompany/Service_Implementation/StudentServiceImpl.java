package com.testCompany.Service_Implementation;

import com.testCompany.DAO.StudentDao;
import com.testCompany.DAO_IMPLEMENTATION.StudentDaoImpl;
import com.testCompany.Model.Student;
import com.testCompany.Service.StudentService;

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
