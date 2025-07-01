package Model;

import DataBase.BookDBManager;
import DataBase.StudentDBManager;
import DataBase.DepartmentDBManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BookDBManager bookDBManager = new BookDBManager();
        StudentDBManager studentDBManager = new StudentDBManager();
        DepartmentDBManager departmentDBManager = new DepartmentDBManager();

        System.out.println("Library Management System Example");


        System.out.println("Enter Book ID:");
        int bookId = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Book Name:");
        String bookName = sc.nextLine();
        System.out.println("Enter ISBN:");
        int isbn = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Author:");
        String author = sc.nextLine();
        System.out.println("Enter Quantity:");
        int qty = sc.nextInt();
        sc.nextLine();
        Book book = new Book(bookId, bookName, isbn, author, qty);
        bookDBManager.addBook(book);

        System.out.println("Enter Student ID:");
        int studentId = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Student Name:");
        String studentName = sc.nextLine();
        System.out.println("Enter Roll Number:");
        String rollNumber = sc.nextLine();
        Student student = new Student(studentId, studentName, rollNumber);
        studentDBManager.addStudent(student);


        System.out.println("Enter Department ID:");
        int deptId = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Department Name:");
        String deptName = sc.nextLine();
        System.out.println("Enter Department Code:");
        String deptCode = sc.nextLine();
        Department department = new Department(deptId, deptName, deptCode);
        departmentDBManager.addDepartment(department);
    }
}
