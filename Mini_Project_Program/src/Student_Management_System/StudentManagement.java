package Student_Management_System;
import java.util.*;

public class StudentManagement {
    Department department;
    Student student;
    Scanner sc;

    StudentManagement() {
        department = new Department("SWE","12WE");
        student = new Student(department);
        sc = new Scanner(System.in);
    }


    void showMenu(){
        while (true){
            System.out.println("<<<<<<<<<WELL COME TO THE STUDENT MANAGEMENT SYSTEM>>>>>>> ");
            System.out.println("1- Student Management");
            System.out.println("2- Department Management");
            System.out.println("3- Exit");
            System.out.print("Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                studentMenu();
            } else if (choice == 2) {
                departmentMenu();
            } else if (choice == 3) {
                System.out.println("Thanks for Using Our Student Management System.");
                break;
            } else {
                System.out.println("You Entered Invalid choice");
            }
        }
    }


    void studentMenu() {
        while (true) {
            System.out.println("1- Add Student");
            System.out.println("2- Update Student");
            System.out.println("3- Delete Student");
            System.out.println("4- Get Single Student");
            System.out.println("5- Get All Students");
            System.out.println("6- Back to Main Menu");
            System.out.print("Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Enter student id: ");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter student name: ");
                String name = sc.nextLine();
                System.out.print("Enter roll number: ");
                String rollNo = sc.nextLine();
                System.out.print("Enter department code: ");
                String deptCode = sc.nextLine();
                student.addstudents(id, name, rollNo, deptCode);
            } else if (choice == 2) {
                System.out.print("Enter student id to update: ");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter new name: ");
                String name = sc.nextLine();
                System.out.print("Enter new roll number: ");
                String rollNo = sc.nextLine();
                System.out.print("Enter new department code: ");
                String deptCode = sc.nextLine();
                student.updatestudents(id, name, rollNo, deptCode);
            } else if (choice == 3) {
                System.out.print("Enter student id to delete: ");
                int id = sc.nextInt();
                student.deletestudents(id);
            } else if (choice == 4) {
                System.out.print("Enter student id to get: ");
                int id = sc.nextInt();
                student.getSinglestudents(id);
            } else if (choice == 5) {
                student.displayAllstudents(student.id);
            } else if (choice == 6) {
                break;
            } else {
                System.out.println("You Entered Invalid choice");
            }
        }
    }

    void departmentMenu() {
        while (true) {
            System.out.println("1- Add Department");
            System.out.println("2- Update Department");
            System.out.println("3- Delete Department");
            System.out.println("4- Get Single Department");
            System.out.println("5- Get All Departments");
            System.out.println("6- Back to Main Menu");
            System.out.print("Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Enter department name: ");
                String name = sc.nextLine();
                System.out.print("Enter department code: ");
                String code = sc.nextLine();
                department.adddepartments(name, code);
            } else if (choice == 2) {
                System.out.print("Enter department code to update: ");
                String code = sc.nextLine();
                System.out.print("Enter new department name: ");
                String newName = sc.nextLine();
                System.out.print("Enter new department code: ");
                String newCode = sc.nextLine();
                department.updatedepartments(code, newName, newCode);
            } else if (choice == 3) {
                System.out.print("Enter department code to delete: ");
                String code = sc.nextLine();
                department.deletedepartment(code);
            } else if (choice == 4) {
                System.out.print("Enter department code to get: ");
                String code = sc.nextLine();
                department.getSingledepartments(code);
            } else if (choice == 5) {
                department.displayAlldepartments(department.code);
            } else if (choice == 6) {
                break;
            } else {
                System.out.println("You Entered Invalid choice");
            }

        }
    }
}