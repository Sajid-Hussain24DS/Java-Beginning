package com.Test.polymorphism;

public class Mobile extends ElectronicDevices{
    @Override
    public void maxBattery() {
        System.out.println(super.getName()+"Mobile has max battery is 5000mah");

    }
}
