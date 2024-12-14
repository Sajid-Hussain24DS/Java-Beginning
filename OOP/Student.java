class Student {
    String name;
    String rollNumber;
    String department ;
    String university;

    public static void main(String args[]){
        Student sajid = new Student();
        sajid.name = "Sajid Hussain:";
        sajid.rollNumber = "133";
        sajid.department = "BS DATA SCIENCE";
        sajid.university = "Dawood UET";

        System.out.println("<<<<<Studenet>>>>>");
        System.out.println("Name : "+sajid.name);
        System.out.println("Roll Number : "+sajid.rollNumber);
        System.out.println("Department :"+sajid.department);
        System.out.println("University :"+sajid.university);

        Student sohail = new Student();
        sohail.name = "Sohail Ali :";
        sohail.rollNumber = "1423";
        sohail.department = "Telecomunication";
        sohail.university = "MUET";
        System.out.println(" ");
        System.out.println("Name :"+sohail.name);
        System.out.println("Roll Number :"+sohail.rollNumber);
        System.out.println("Department : "+sohail.department);
        System.out.println("University :"+sohail.university);

        Student mudasir = new Student();
        mudasir.name = "Mudasir Ali:";
        mudasir.rollNumber = "1523";
        mudasir.department = "MBBS";
        mudasir.university = "LUMHS";
        System.out.println(" ");
        System.out.println("Name :"+mudasir.name);
        System.out.println("Roll Number :"+mudasir.rollNumber);
        System.out.println("Department :"+mudasir.department);
        System.out.println("University :"+mudasir.university);

        Student faisal = new Student();
        faisal.name = "Faisal Ali:";
        faisal.rollNumber = "1224";
        faisal.department = "Electronics";
        faisal.university = "Sindh University";
        System.out.println(" ");
        System.out.println("Name :"+faisal.name);
        System.out.println("Roll Number :"+faisal.rollNumber);
        System.out.println("Department :"+faisal.department);
        System.out.println("University :"+faisal.university);

        Student habib = new Student();
        habib.name = "Habib Ali:";
        habib.rollNumber = "1342";
        habib.department = "Softwere Engineering";
        habib.university = "S M I U";
        System.out.println(" ");
        System.out.println("Name :"+faisal.name);
        System.out.println("Roll Number :"+faisal.rollNumber);
        System.out.println("Department :"+faisal.department);
        System.out.println("University :"+faisal.university);



    }
}