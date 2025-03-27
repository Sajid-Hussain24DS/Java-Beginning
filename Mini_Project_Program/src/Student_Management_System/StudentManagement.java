package Student_Management_System;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {
   ArrayList<Student> students = new ArrayList<>();
   ArrayList<Department> departments = new ArrayList<>();
   Scanner sc = new Scanner(System.in);


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
                System.out.println("Invalid choice");
            }
        }
    }
    boolean isDepartmentExist(String code){
        for (int i =0; i<departments.size();i++){
            if (departments.get(i).code.equals(code)){
                return true;
            }
        }

        return false;
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
                if (isDepartmentExist(deptCode)){
                    students.add(new Student(id,name,rollNo,deptCode));
                    System.out.println("Student Added Successfully");
                }else{
                    System.out.println("Department not Found.");
                }


            } else if (choice == 2) {
                System.out.print("Enter student id to update: ");
                int id = sc.nextInt();
                sc.nextLine();

                for (int i=0;i<students.size();i++){
                    if (students.get(i).id == id) {
                        System.out.print("Enter new name: ");
                        students.get(i).name = sc.nextLine();

                        System.out.print("Enter new roll number: ");
                        students.get(i).rollNumber = sc.nextLine();

                        System.out.print("Enter new department code: ");
                        String newDeptCode = sc.nextLine();
                        if (isDepartmentExist(newDeptCode)){
                        students.get(i).departmentCode = sc.nextLine();
                        System.out.println("Student Updated Successfully");
                        return;
                    }
                }}
                       System.out.println("Student not Found");

            } else if (choice == 3) {
                System.out.print("Enter student id to delete: ");
                int id = sc.nextInt();
                for (int i=0;i<students.size();i++){
                    if (students.get(i).id == id) {
                        students.remove(i);
                        System.out.println("Student Deleted Successfully");
                        return;
                    }
                }
                System.out.println("Student not Found");

            } else if (choice == 4) {
                System.out.print("Enter student id to get: ");
                int id = sc.nextInt();
                for (int i=0;i<students.size();i++){
                    if (students.get(i).id == id) {
                        students.get(i).studentInfo();
                        return;
                    }}
                System.out.println("Student not Found");

            } else if (choice == 5) {
                for (int i = 0; i < students.size(); i++) {
                    students.get(i).studentInfo();
                }
            }else if (choice == 6){
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
                departments.add(new Department(name, code));
                System.out.println("Department Added Successfully");

            } else if (choice == 2) {
                System.out.print("Enter department code to update: ");
                String code = sc.nextLine();

                for (int i=0; i<departments.size(); i++){
                    if (departments.get(i).code.equals(code)){
                System.out.print("Enter new department name: ");
                departments.get(i).name = sc.nextLine();
                System.out.print("Enter new department code: ");
                departments.get(i).code = sc.nextLine();
                        System.out.println("Department Updated Successfully");
                        return;
                    }
                }
                System.out.println("Department Not Found.");


            } else if (choice == 3) {
                System.out.print("Enter department code to delete: ");
                String code = sc.nextLine();
                for (int i=0; i<departments.size(); i++){
                    if (departments.get(i).code.equals(code)){
                        departments.remove(i);
                        System.out.println("Department Deleted Successfully.");
                        return;
                    }
                }
                System.out.println("Department Not Found.");

            } else if (choice == 4) {
                System.out.print("Enter department code to get: ");
                String code = sc.nextLine();
                for (int i=0; i<departments.size(); i++){
                    if (departments.get(i).code.equals(code)){
                departments.get(i).departmentInfo();
                return;
                    }
                }
                System.out.println("Department Not Found.");
            } else if (choice == 5) {
                for (int i=0; i<departments.size(); i++) {
                    departments.get(i).departmentInfo();
                }
            } else if (choice == 6) {
                break;
            } else {
                System.out.println("You Entered Invalid choice");
            }

        }
    }
}