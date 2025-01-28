package com.Test.polymorphism;

public class Laptop extends ElectronicDevices{
    @Override
    public void maxBattery() {
        System.out.println(super.getName()+"Laptop max battery is 7000mah");

    }
}
