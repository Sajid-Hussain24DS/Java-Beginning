package com.Test.polymorphism;

public class Test {
    public static void main(String[] args) {
        Laptop l = new Laptop();
        l.setName("lenovo core i7 ");
        l.maxBattery();

        Mobile m = new Mobile();
        m.setName("Vivo Y100 ");
        m.maxBattery();

        SmartWatche w  = new SmartWatche();
        w.setName("Galaxy Watch ");
        w.maxBattery();

        Tablets t  = new Tablets();
        t.setName("I Pad ");
        t.maxBattery();



    }
}
