package database;

import model.Student;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentDBManager {

    Connection connection = DBConnection.getDbConnection();

    public void addStudent(Student student) {
        try {
            Statement statement = connection.createStatement();

            String insert = "INSERT INTO students (roll_number, age, s_name) " +
                    "VALUES ('" + student.getRollNumber() + "', " + student.getAge() + ", '" + student.getName() + "')";
            int rst = statement.executeUpdate(insert);
            if (rst>0){
                System.out.println("Student DATA Inserted Successfully!");
            }else
                System.out.println("DATA Not Inserted!");



        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Student> getAllStudents(){
        List<Student> students = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            String getAllStudents = "Select*from students";
            ResultSet resultSet = statement.executeQuery(getAllStudents);
            while (resultSet.next()){
                String name = resultSet.getString("s_name");
                int age = resultSet.getInt("age");
                String rollNumber = resultSet.getString("roll_number");
                Student student = new Student(name,rollNumber,age);
                students.add(student);

            }

        }catch (Exception e){
            e.printStackTrace();
        }
return students;
    }
    public void deleteStudentById(int studentId){
        try{
            Statement statement = connection.createStatement();
            String delete = "delete from students where student_id=" + studentId;
            int rows = statement.executeUpdate(delete);
            if(rows>0){
                System.out.println("Student deleted successfully");
            }else{
                System.out.println("Error occurred while deleting student");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
