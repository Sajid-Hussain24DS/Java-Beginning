package DAO;

import  Model.Student;
import java.util.List;

public interface StudentDao {
    void addStudent(Student student);
    void deleteStudent(int studentId);
    List<Student> getAllStudents();

    public boolean insertStudent(Student student);
}
