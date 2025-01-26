package com.test.Encapsulation;

public class Test {
    public static void main(String[] args) {
    Car myCar = new Car();
    myCar.setModel("Toyota Camry");
    myCar.setYear(2022);
    myCar.setColor("Black");
    myCar.setEngineCapacity(2.5);
    myCar.setMileage(40000);

        System.out.println("Model "+myCar.getModel());
        System.out.println("Year "+myCar.getYear());
        System.out.println("Colour "+myCar.getColor());
        System.out.println("The Engine Capacity "+myCar.getEngineCapacity()+"letter");
        System.out.println("Mileage of Car "+myCar.getMileage()+"KM");

}
 }
