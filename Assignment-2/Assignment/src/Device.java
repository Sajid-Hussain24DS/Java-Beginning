public class Device {
    int deviceNo;
    String deviceName, deviceType;
    double devicePrice;



    void Device(int deviceNo, String deviceName, String deviceType, double devicePrice) {
        this.deviceNo = deviceNo;
        this.deviceName = deviceName;
        this.deviceType = deviceType;
        this.devicePrice = devicePrice;

    }

    public void displayDetails(){
        System.out.println("Device No:"+deviceNo);
        System.out.println("Device Name:"+deviceName);
        System.out.println("Device Type:"+deviceType);
        System.out.println("Device Price:"+deviceType);
    }

    public static void main(String[] args) {
        Device device = new Device(101,"samrtPhone","Electronic",199.9);
        device.displayDetails();


    }


}




