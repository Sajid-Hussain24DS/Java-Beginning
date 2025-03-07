package com.test.Association;

public class Test1 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.setName("Shah Jamal");
        professor.setSubject("Programing Fundamental");

        Department department = new Department();
        department.setName("Data Science Department");
        department.setProfessor(professor);

        University university = new University();
        university.setName("DUET University");
        university.setDepartment(department);

        System.out.println("University Name: " + university.getName());
        System.out.println("Department Name: " + university.getDepartment().getName());
        System.out.println("Professor Name: " + university.getDepartment().getProfessor().getName());
        System.out.println("Professor Subject: " + university.getDepartment().getProfessor().getSubject());
    }

}
