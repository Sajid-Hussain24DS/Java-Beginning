package abstraction;

// this is abstract class Or Incomplete class
public abstract class Vehicle {

    private String name;
    private String model;

    // just Declare method , we do not give implementation
    // this is abstract method OR u can say that object

    public abstract void maxSpeed();

    public void setName(String name) {
        this.name = name;
    }

    public void setModel(String model) {
        this.model = model;
    }
     public void show(){
         System.out.println("Name :"+this.name);
         System.out.println("Model :"+this.model);
     }
}
