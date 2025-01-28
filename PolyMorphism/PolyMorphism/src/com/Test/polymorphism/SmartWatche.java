package com.Test.polymorphism;

public class SmartWatche extends ElectronicDevices{
    @Override
    public void maxBattery() {
        System.out.println(super.getName()+"Watch has max battery is 3500mah");

    }
}
