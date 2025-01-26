package com.test.Encapsulation;

public class Hotel {
    private String name;
    private String location;
    private String rating;
    private String roomType;
    private String pricePerNight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public String getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(String pricePerNight) {
        this.pricePerNight = pricePerNight;
    }
    public void Hotel1(){
        System.out.println(this.getName());
        System.out.println(this.getLocation());
        System.out.println(this.getRating());
        System.out.println(this.getRoomType());
        System.out.println(this.getPricePerNight());
    }
}
