package Model;

import DataBase.BookDBManager;
import DataBase.StudentDBManager;
import DataBase.DepartmentDBManager;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BookDBManager bookDBManager = new BookDBManager();
        StudentDBManager studentDBManager = new StudentDBManager();
        DepartmentDBManager departmentDBManager = new DepartmentDBManager();

        System.out.println("===== Library Management System Project =====");

        boolean running = true;

        while (running) {
            System.out.println("\nPlease choose an option:");
            System.out.println("1. Add Record");
            System.out.println("2. Delete Record");
            System.out.println("3. Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Add: 1. Book  2. Student  3. Department");
                    int addChoice = sc.nextInt();
                    sc.nextLine();

                    if (addChoice == 1) {
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
                        List<Book> books = bookDBManager.getAllBooks();
                        System.out.println(books);

                    } else if (addChoice == 2) {
                        System.out.println("Enter Student ID:");
                        int studentId = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Enter Student Name:");
                        String studentName = sc.nextLine();
                        System.out.println("Enter Roll Number:");
                        String rollNumber = sc.nextLine();
                        Student student = new Student(studentId, studentName, rollNumber);
                        studentDBManager.addStudent(student);
                        List<Student> students = studentDBManager.getAllStudents();
                        System.out.println(students);

                    } else if (addChoice == 3) {
                        System.out.println("Enter Department ID:");
                        int deptId = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Enter Department Name:");
                        String deptName = sc.nextLine();
                        System.out.println("Enter Department Code:");
                        String deptCode = sc.nextLine();
                        Department department = new Department(deptId, deptName, deptCode);
                        departmentDBManager.addDepartment(department);
                        List<Department> departments = departmentDBManager.getAllDepartments();
                        System.out.println(departments);
                    } else {
                        System.out.println("Invalid Option.");
                    }
                    break;

                case 2:
                    System.out.println("Delete: 1. Book  2. Student  3. Department");
                    int delChoice = sc.nextInt();
                    sc.nextLine();

                    if (delChoice == 1) {
                        System.out.println("Enter Book ID to Delete:");
                        int bookID = sc.nextInt();
                        sc.nextLine();
                        bookDBManager.deleteBook(bookID);

                    } else if (delChoice == 2) {
                        System.out.println("Enter Student ID to Delete:");
                        int studentID = sc.nextInt();
                        sc.nextLine();
                        studentDBManager.deleteStudent(studentID);

                    } else if (delChoice == 3) {
                        System.out.println("Enter Department ID to Delete:");
                        int deptID = sc.nextInt();
                        sc.nextLine();
                        departmentDBManager.deleteDepartment(deptID);

                    } else {
                        System.out.println("Invalid Option.");
                    }
                    break;

                case 3:
                    running = false;
                    System.out.println("Exiting... Thank you!");
                    break;

                default:
                    System.out.println("Invalid Choice. Please try again.");
            }
        }
    }
}
