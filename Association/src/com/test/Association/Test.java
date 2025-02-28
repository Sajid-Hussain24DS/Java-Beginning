package com.test.Association;

public class Test {
    public static void main(String[] args) {
        Laptop l = new Laptop();
        l.setCompany("Lenovo");
        l.setPrice(40000);
        l.setSerialNo("2389468327d");

        HardDrive hd = new HardDrive();
        hd.setPrice(4500d);
        hd.setName("Backup Drive ");


        l.setHardDrive(hd);
        System.out.println("Company"+l.getCompany());
        System.out.println("HardDrive"+l.getHardDrive());



    }

}
