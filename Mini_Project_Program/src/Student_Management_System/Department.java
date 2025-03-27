package Student_Management_System;
import java.util.ArrayList;

public class Department {
    String name,code;

    Department(String name,String code){
        this.name = name;
        this.code = code;
    }

    public void departmentInfo(){
        System.out.println("Department Name: "+ name);
        System.out.println("Department Code: "+ code);
    }

    }