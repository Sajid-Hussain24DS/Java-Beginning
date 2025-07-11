package com.testCompany.DAO;

import com.testCompany.Model.Student;
import java.util.List;

public interface StudentDao {
    void addStudent(Student student);
    void deleteStudent(int studentId);
    List<Student> getAllStudents();
}
