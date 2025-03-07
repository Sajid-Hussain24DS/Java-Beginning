package com.test.Association;

public class Test {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.setCompany("Mac Book");
        laptop.setPrice(40000);
        laptop.setMacAddress(2389468327d);

        HardDrive hd = new HardDrive();
        hd.setPrice( 4500d);
        hd.setName(" MacHardDrive");

        laptop.setHardDrive(hd);
        
        System.out.println("Company :"+laptop.getCompany());
        System.out.println("HardDrive :"+laptop.getHardDrive().getPrice());
        System.out.println("HardDrive :"+laptop.getHardDrive().getName());
        System.out.println("");

        System.out.println("Car Details >>>>>>>>>>>");
        Engine engine = new Engine();
        engine.setType("1.8L");
        engine.setHorsePower(800.0);

        Car car = new Car();
        car.setModel("Civic");
        car.setEngine(engine);

        System.out.println("Car Model: " + car.getModel());
        System.out.println("Engine Type: " + car.getEngine().getType());
        System.out.println("Engine Horsepower: " + car.getEngine().getHorsePower());




    }

}
