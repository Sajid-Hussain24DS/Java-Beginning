package Model;

import DATABASE.Student_DB_Manager;
import DATABASE.Department_DB_Manager;
import DATABASE.Student_Department_Manager;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student_DB_Manager studentDBManager = new Student_DB_Manager();
        Department_DB_Manager departmentDBManager = new Department_DB_Manager();
        Student_Department_Manager studentDepartmentManager = new Student_Department_Manager();

        System.out.println("===== Library Management System Project =====");

        boolean running = true;

        while (running) {
            System.out.println("\nPlease choose an option:");
            System.out.println("1. Add Record");
            System.out.println("2. Delete Record");
            System.out.println("3. View All Student-Department Info");
            System.out.println("4. Exit");

            int choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    System.out.println("Add: 1. Student  2. Department");
                    int addChoice = sc.nextInt();
                    sc.nextLine(); // clear buffer

                    if (addChoice == 1) {
                        System.out.println("Enter Student ID:");
                        int studentId = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Enter Student Name:");
                        String studentName = sc.nextLine();
                        System.out.println("Enter Roll Number:");
                        String rollNumber = sc.nextLine();
                        System.out.println("Enter Department ID:");
                        int deptId = sc.nextInt();
                        sc.nextLine();

                        Department department = new Department();
                        department.setDeptId(deptId);

                        Student student = new Student();
                        student.setStudentId(studentId);
                        student.setName(studentName);
                        student.setRollNumber(rollNumber);
                        student.setDepartment(department); // ✅ important

                        studentDBManager.addStudent(student);
                        List<Student> students = studentDBManager.getAllStudents();
                        System.out.println(students);

                    } else if (addChoice == 2) {
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
                    System.out.println("Delete: 1. Student  2. Department");
                    int delChoice = sc.nextInt();
                    sc.nextLine();

                    if (delChoice == 1) {
                        System.out.println("Enter Student ID to Delete:");
                        int studentID = sc.nextInt();
                        sc.nextLine();
                        studentDBManager.deleteStudent(studentID);

                    } else if (delChoice == 2) {
                        System.out.println("Enter Department ID to Delete:");
                        int deptID = sc.nextInt();
                        sc.nextLine();
                        departmentDBManager.deleteDepartment(deptID);

                    } else {
                        System.out.println("Invalid Option.");
                    }
                    break;

                case 3:
                    System.out.println("===== All Students With Department Info =====");
                    List<StudentDepartment> studentDepartments = studentDepartmentManager.getAllStudentWithNameAndDept();
                    for (StudentDepartment sd : studentDepartments) {
                        System.out.println(sd);
                    }
                    break;

                case 4:
                    running = false;
                    System.out.println("Exiting... Thank you!");
                    break;

                default:
                    System.out.println("Invalid Choice. Please try again.");
            }
        }
    }
}
