package abstraction;

public class Manager extends Employee{
    @Override
    public void salary() {
        System.out.println("Manager's salary can be more or less than 1 lakh.");
    }
}
