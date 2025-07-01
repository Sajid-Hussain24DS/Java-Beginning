import database.DepartmentDbManager;
import database.StudentDBManager;
import model.Department;
import model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        StudentDBManager studentDBManager = new StudentDBManager();

       Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name : ");
        String name = sc.nextLine();

        System.out.print("Enter Student Age : ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Student Roll Number : ");
        String rollNumber = sc.nextLine();


        Student student = new Student(name,rollNumber,age);
        studentDBManager.addStudent(student);


        List<Student> students = studentDBManager.getAllStudents();
        System.out.println(students);
        studentDBManager.deleteStudentById(2);

       // System.out.println("Enter Department id to update :");
       // int dept_id = sc.nextInt();

        System.out.println("Enter department Name to insert :");
        String departmentName = sc.nextLine();

        System.out.println("Enter department Code to insert :");
        String departmentCode = sc.nextLine();

        Department department = new Department();
        department.setDeptName(departmentName);
        department.setDeptCode(departmentCode);

        DepartmentDbManager departmentDbManager = new DepartmentDbManager();
        departmentDbManager.addDepartment(department);


    }
}