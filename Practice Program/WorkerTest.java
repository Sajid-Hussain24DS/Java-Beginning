// Create a class Worker with the following properties and method
// Problem 1
class Worker {
    int salary;
    String employeeName;

    // Getter for salary
    public int getSalary() {
        return salary;
    }

    // Getter for name
    public String getEmployeeName() {
        return employeeName;
    }

    // Setter for name
    public void setEmployeeName(String name) {
        employeeName = name;
    }
}
// Problem 02
class CellPhone{
    public void ring(){
        System.out.println("Ringing.......");
    }
    public void vibrate() {
        System.out.println("Vibrating.......");
    }
    public void callFriend() {
        System.out.println("Calling Sohail.......");
    }
}


public class WorkerTest {
    public static void main(String[] args) {
        Worker sohail = new Worker();
        sohail.salary = 50000;
        sohail.setEmployeeName("Sohail Ali");

        // Output name and salary using the getter methods
        System.out.println(sohail.getEmployeeName());
        System.out.println(sohail.getSalary());
        // Problem 2
        CellPhone  faisal = new CellPhone();
        faisal.callFriend();
        faisal.vibrate();
        faisal.ring();


    }
}

