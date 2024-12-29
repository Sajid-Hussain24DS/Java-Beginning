class Vehicle{
    public void drive() {
        System.out.println(" Deriving Vehicles");


    }
}
class Car extends Vehicle{
    public void drive() {
        System.out.println("Repairing a Car");


    }
    public static void main(String args[]){
        Car myCar = new Car();
        myCar.drive();
    }
}