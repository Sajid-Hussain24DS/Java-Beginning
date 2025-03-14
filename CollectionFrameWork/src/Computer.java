public class Computer {
    private String brand;
    private String processor;
    private int ramSize;
    public Computer(String brand, String processor, int ramSize) {
        this.brand = brand;
        this.processor = processor;
        this.ramSize = ramSize;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getRamSize() {
        return ramSize;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "brand='" + brand + '\'' +
                ", processor='" + processor + '\'' +
                ", ramSize=" + ramSize +
                '}';
    }
}
