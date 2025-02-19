// Create a class Worker with the following properties and method
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

public class WorkerTest {
    public static void main(String[] args) {
        Worker sohail = new Worker();
        sohail.salary = 50000;
        sohail.setEmployeeName("Sohail Ali");

        // Output name and salary using the getter methods
        System.out.println(sohail.getEmployeeName());
        System.out.println(sohail.getSalary());
    }
}
