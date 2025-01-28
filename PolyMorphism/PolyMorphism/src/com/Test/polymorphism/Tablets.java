package com.Test.polymorphism;

public class Tablets extends ElectronicDevices{
    @Override
    public void maxBattery() {
        System.out.println(super.getName()+" Tablets max battery is 45000mah");

    }
}
