package Student_Management_System;
import java.util.*;
import java.util.LinkedList;

public class Department {

    String name,code;

    LinkedList<Department> departments = new LinkedList<>();


    Department(String name,String code){
        this.name = name;
        this.code = code;
    }

    public void departmentInfo(){
        System.out.println("Department Name: "+ name);
        System.out.println("Department Code: "+ code);
    }

    void adddepartments(String name,String code){
        departments.add(new Department(name,code));
        System.out.println("Department Added Successfully.");
    }

    boolean isDepartmentExist(String code) {
        for (Department department:departments) {
            if (department.code.equals(code)) {
                System.out.println("Yes this is department exist.");
                return true;
            }  }
                System.out.println("Sorry this department doesn't exist.");
        return false;
    }



        void updatedepartments(String code,String newName,String newCode) {
            for (Department department:departments) {
                if(department.code.equals(code)) {
                    department.name = newName;
                    department.code = newCode;
                    System.out.println("Department Update Successfully.");
                    return;
                }}
                    System.out.println("Department Not Found.");
                }
    void deletedepartment(String code){
        Iterator<Department> iterator = departments.iterator();
        while (iterator.hasNext()) {
            Department deptartment = iterator.next();
            if (deptartment.code.equals(code)) {
                iterator.remove();
                System.out.println("Department Deleted Successfully.");
                return;
            }}
                System.out.println("Department Not Found.");
            }

    void getSingledepartments(String code){
        for (Department department:departments) {
            if(department.code.equals(code)) {
                department.departmentInfo();
                System.out.println("Single  Department Get Successfully.");
                return;
            }}
                System.out.println("Department Not Found.");
            }

    void displayAlldepartments(String code){
        for (Department department : departments) {
            department.departmentInfo();
        }}
}



