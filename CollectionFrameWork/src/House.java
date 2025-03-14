public class House {
    private String address;
    private int bedrooms;
    private double price;
    public House(String address, int bedrooms, double price) {
        this.address = address;
        this.bedrooms = bedrooms;
        this.price = price;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "House{" +
                "address='" + address + '\'' +
                ", bedrooms=" + bedrooms +
                ", price=" + price +
                '}';
    }
}
