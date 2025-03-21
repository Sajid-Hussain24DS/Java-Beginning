package Student_Management_System;
import java.util.*;
import java.util.ArrayList;

public class Student {
    int id;
    String name,rollNumber,departmentCode;

    ArrayList<Student> students = new ArrayList<>();
    Department department;

    Student(Department department) {
        this.department = department;
    }


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
        if (department.isDepartmentExist(departmentCode)){
        students.add(new Student(id,name,rollNumber,departmentCode));
        System.out.println("Student Added Successfully.");
    }else{
        System.out.println("Department not found.");
    }}

    void updatestudents(int id,String newName,String newRollNumber,String newDepartmentCode){
        for(int i=0; i<students.size();i++){
            if(students.get(i).id == id) {
                students.get(i).name = newName;
                students.get(i).rollNumber = newRollNumber;
                students.get(i).departmentCode = newDepartmentCode;
                System.out.println("Student Update Successfully.");
                return;
            }}
        System.out.println("Student Not Found.");
    }
    void deletestudents(int id){
         for (int i=0; i<students.size();i++){
             if (students.get(i).id==id){
                 students.remove(i);
                System.out.println("Student Deleted Successfully.");
                return;
            }}
        System.out.println("Student Not Found.");
    }
    void getSinglestudents(int id ){
        for (int i=0; i<students.size();i++){
            if (students.get(i).id==id){
                students.get(i).studentInfo();
                System.out.println("Single Student Get Successfully.");
            }else{
                System.out.println("Student Not Found.");
            }}}

    void displayAllstudents(int id ){
        for (int i=0; i<students.size();i++){
            students.get(i).studentInfo();
            System.out.println();
        }}
}
