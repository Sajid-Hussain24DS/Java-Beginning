package abstraction;

public abstract class Employee {
    private String name;
    private String idNumber;

    public abstract void salary();

    public void setName(String name) {
        this.name = name;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;

    }

     public void display(){
         System.out.println("Name:"+this.name);
         System.out.println("ID Number:"+idNumber);
     }
}
