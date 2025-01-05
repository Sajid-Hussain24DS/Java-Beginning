class Cars{
    String brand;
    String model;
    int year;
    static String companyName;

    public Cars(String model, String brand, int year){
        this.brand= brand;
        this.model = model;
        this.year = year;


    }
    public void displayCarInfo(){
        System.out.println("Brand:"+brand);
        System.out.println("Model:"+model);
        System.out.println("Year"+year);
        System.out.println("Company:"+companyName);
        System.out.print("");

    }
    public static void main(String[]args){
        Cars.companyName = "Toyota";
        Cars car1 = new Cars("Toyota", "Corrola",2008);
        Cars car2 = new Cars("Toyota","Yaris",2023);
        Cars car3 = new Cars("Honda", "Civic", 2018);


        System.out.println("Car One>>>");
        car1.displayCarInfo();

        System.out.println("Car Two>>>");
        car2.displayCarInfo();

        System.out.println("Car Three>>>");
        car3.displayCarInfo();




    }

}