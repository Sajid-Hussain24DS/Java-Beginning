package Student_Management_System;


public class Student {
    int id;
    String name, rollNumber, departmentCode;


    Student(int id, String name, String rollNumber, String departmentCode) {
        this.id = id;
        this.name = name;
        this.rollNumber = rollNumber;
        this.departmentCode = departmentCode;
    }

    public void studentInfo() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        System.out.println("Student Roll Number: " + rollNumber);
        System.out.println("Student Department Code: " + departmentCode);
    }

}