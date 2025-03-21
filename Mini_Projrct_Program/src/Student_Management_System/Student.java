package Student_Management_System;
import java.util.*;
import java.util.LinkedList;

public class Student {
     int id;
    String name,rollNumber,departmentCode;

    LinkedList<Student> students = new LinkedList<>();


    Student(int id, String name, String rollNumber, String departmentCode){
        this.id = id;
        this.name = name;
        this.rollNumber =rollNumber;
        this.departmentCode = departmentCode;
    }

    public void studentInfo(){
        System.out.println("Student ID: "+ id);
        System.out.println("Student Name: "+ name);
        System.out.println("Student Roll Number: "+ rollNumber);
        System.out.println("Student Department Code: "+ departmentCode);
    }

    void addstudents(int id,String name,String rollNumber,String departmentCode){
        students.add(new Student(id,name,rollNumber,departmentCode));
        System.out.println("Student Added Successfully.");
    }

    void updatestudents(int id,String newName,String newRollNumber,String newDepartmentCode){
        for(Student student: students){
            if(student.id == id) {
                student.name = newName;
                student.rollNumber = newRollNumber;
                student.departmentCode = newDepartmentCode;
                System.out.println("Student Update Successfully.");
                return;
            }}
                System.out.println("Student Not Found.");
            }
    void deletestudents(String code){
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.equals(code)) {
                iterator.remove();
                System.out.println("Student Deleted Successfully.");
                return;
            }}
        System.out.println("Student Not Found.");
    }
    void getSinglestudents(int id ){
        for(Student student: students){
            if (student.id==id){
                student.studentInfo();
                System.out.println("Single Student Get Successfully.");
            }else{
                System.out.println("Student Not Found.");
            }}}

    void displayAllstudents(int id ){
        for (Student student : students) {
            student.studentInfo();
            }}
}


