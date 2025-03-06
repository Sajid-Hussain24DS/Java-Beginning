package com.test.Association;

public class Laptop {
    private String company;
    private double price;
    private double macAddress;
    private HardDrive hardDrive;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(double macAddress) {
        this.macAddress = macAddress;
    }

    public HardDrive getHardDrive() {
        return hardDrive;
    }

    public void setHardDrive(HardDrive hardDrive) {
        this.hardDrive = hardDrive;
    }
}
