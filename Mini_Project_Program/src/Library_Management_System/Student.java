package Library_Management_System;

public class Student {

    String studentName;
    int studentId;
    String studentRollNumber;
    String studentIsbian;

    public Student(String studentName,int studentId, String studentRollNumber,String  studentIsbian) {
        this.studentName = studentName;
        this.studentId = studentId;
        this.studentRollNumber = studentRollNumber;
        this.studentIsbian = studentIsbian;
    }
    public void showStudentData() {
        System.out.println(studentName + "     " + studentId + "     " + studentRollNumber + "     " + studentIsbian+"   ");
    }


}