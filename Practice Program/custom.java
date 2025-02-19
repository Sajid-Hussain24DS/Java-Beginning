class Employee{
    int salary ;
    int id ;
    String name ;
    public void printDetails(){ // Method one
        System.out.println("My id is "+id);
        System.out.println("My name is "+name);
        System.out.println("My Salary is "+ salary);
    }
    //  public int getSalary(){
   //      return salary;
   // }
}
public class Custom {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee sajid = new Employee(); //Initiating a new Employee Object
        Employee shahid = new Employee();
        // Setting Attributes For Sajid
        sajid.id = 736;
        sajid.name= "Sajid Hussain";
        sajid.salary = 70000;

        // Setting Attributes For Shahid
        shahid.id = 8472;
        shahid.name = "Shahid Hussain";
        shahid.salary = 80000;

        sajid.printDetails();
        shahid.printDetails();
//int  salaryShahid = shahid.getSalary();
      //  System.out.println(salaryShahid);
     //   int  salarySajid = sajid.getSalary();
    //    System.out.println(salarySajid);

    }
}
