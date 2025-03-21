package Student_Management_System;
import java.util.*;
import java.util.ArrayList;

public class Department {

    String name,code;

    ArrayList<Department> departments = new ArrayList<>();


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
        System.out.println();
    }

    boolean isDepartmentExist(String code) {
        for (int i=0;i<departments.size();i++) {
            if (departments.get(i).equals(code)) {
                System.out.println("Yes this is department exist.");
                return true;
            }  }
        System.out.println("Sorry this department doesn't exist.");
        return false;
    }



    void updatedepartments(String code,String newName,String newCode) {
      for(int i=0; i<departments.size();i++) {
            if(departments.get(i).equals(code)) {
                departments.get(i).name = newName;
                departments.get(i).code = newCode;
                System.out.println("Department Updated Successfully.");
                return;
            }}
        System.out.println("Department Not Found.");
    }
    void deletedepartment(String code){
        for(int i=0; i<departments.size();i++) {
            if ( departments.get(i).equals(code)) {
                departments.remove(i);
                System.out.println("Department Deleted Successfully.");
                return;
            }}
        System.out.println("Department Not Found.");
    }

    void getSingledepartments(String code){
        for(int i=0; i<departments.size();i++) {
            if(departments.get(i).equals(code)) {
                departments.get(i).departmentInfo();
                System.out.println("Single  Department Get Successfully.");
                return;
            }}
        System.out.println("Department Not Found.");
    }

    void displayAlldepartments(String code){
        for(int i=0; i<departments.size();i++) {
            departments.get(i).departmentInfo();
        }}
}