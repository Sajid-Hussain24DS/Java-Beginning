class Employee{
    int id ;
    String name ;
    public void printDetails(){ // Method
        System.out.println("My id is "+id);
        System.out.println("My name is "+name);
    }
}
public class Custom {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee sajid = new Employee(); //Initiating a new Employee Object
        Employee shahid = new Employee();
        // Setting Attributes
        sajid.id = 736;
        sajid.name= "Sajid Hussain";
        shahid.id = 8472;
        shahid.name = "Shahid Hussain";
        sajid.printDetails();
        shahid.printDetails();
    }
}
