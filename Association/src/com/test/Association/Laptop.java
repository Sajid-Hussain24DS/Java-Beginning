package com.test.Association;

public class Laptop {
    private String company;
    private double price;
    private String serialNo;
    private String HardDrive;

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

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public void setHardDrive(HardDrive hd) {

    }

    public String getHardDrive() {
        return HardDrive;
    }
}
