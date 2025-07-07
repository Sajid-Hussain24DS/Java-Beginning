package Model;

import Model.Department;
import Model.Student;
import SERVICE.DepartmentService;
import SERVICE.StudentService;
import SERVICE_IMPLEMENTATION.DepartmentServiceImpl;
import SERVICE_IMPLEMENTATION.StudentServiceImpl;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentService studentService = new StudentServiceImpl();
        DepartmentService departmentService = new DepartmentServiceImpl();

        boolean running = true;

        while (running) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Add Student");
            System.out.println("2. Delete Student");
            System.out.println("3. Show All Students");
            System.out.println("4. Add Department");
            System.out.println("5. Delete Department");
            System.out.println("6. Show All Departments");
            System.out.println("7. Exit");
            System.out.print("Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Student ID: ");
                    int sid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Name: ");
                    String sname = sc.nextLine();
                    System.out.print("Roll No: ");
                    String sroll = sc.nextLine();
                    System.out.print("Department ID: ");
                    int did = sc.nextInt();
                    Student s = new Student();
                    Department d = new Department();
                    d.setDeptId(did);
                    s.setStudentId(sid);
                    s.setName(sname);
                    s.setRollNumber(sroll);
                    s.setDepartment(d);
                    studentService.addStudent(s);
                    break;

                case 2:
                    System.out.print("Student ID: ");
                    int delSid = sc.nextInt();
                    studentService.deleteStudent(delSid);
                    break;

                case 3:
                    List<Student> students = studentService.getAllStudents();
                    for (Student stu : students) {
                        System.out.println(stu);
                    }
                    break;

                case 4:
                    System.out.print("Department ID: ");
                    int depId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Department Name: ");
                    String depName = sc.nextLine();
                    System.out.print("Department Code: ");
                    String depCode = sc.nextLine();
                    Department department = new Department();
                    department.setDeptId(depId);
                    department.setDeptName(depName);
                    department.setDeptCode(depCode);
                    departmentService.addDepartment(department);
                    break;

                case 5:
                    System.out.print("Department ID: ");
                    int delDid = sc.nextInt();
                    departmentService.deleteDepartment(delDid);
                    break;

                case 6:
                    List<Department> departments = departmentService.getAllDepartments();
                    for (Department dep : departments) {
                        System.out.println(dep);
                    }
                    break;

                case 7:
                    running = false;
                    break;

                default:
                    System.out.println("Invalid Option");
            }
        }
        sc.close();
    }
}
