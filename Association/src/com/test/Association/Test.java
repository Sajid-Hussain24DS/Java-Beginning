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
        
        System.out.println("Company"+laptop.getCompany());
        System.out.println("HardDrive"+laptop.getHardDrive().getPrice());
        System.out.println("HardDrive"+laptop.getHardDrive().getName());




    }

}
