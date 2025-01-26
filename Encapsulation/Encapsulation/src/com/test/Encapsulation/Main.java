package com.test.Encapsulation;

public class Main {
    public static void main(String[] args) {
        UniversityDetail student = new UniversityDetail();
        student.setUniName("Dawood UET");
        student.setEstablishedYear("1998");
        student.setStudentName("Sajid Hussain");
        student.setDepartment("BS Data Science");
        student.setIdCard("387469458");

        System.out.println("University : "+student.getUniName());
        System.out.println("Established Year :"+student.getEstablishedYear());
        System.out.println("Student Name :"+student.getStudentName());
        System.out.println("Department :"+student.getDepartment());
        System.out.println("Student I'd :"+student.getIdCard());
        System.out.println();




        // Computer Encapsulation program

        Computer computer = new Computer();
        computer.setBrand("Lenovo");
        computer.setModel("ThinkPad");
        computer.setRam(8);
        computer.setStorage(1000);
        System.out.println("Computer Program>>>>>>>>");
        System.out.println("Brand :"+ computer.getBrand());
        System.out.println("Model :"+computer.getModel());
        System.out.println("Ram :"+computer.getRam());
        System.out.println("Storage :"+computer.getStorage()+"GB");

    }


}
