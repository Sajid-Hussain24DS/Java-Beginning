class Hotel{
    String name ;
    String location;
    String breakFastMenu;
    String lunchMenu;
    String dinnerMenu;
    String beveragesMenu;

// here we call object with help of Method
    public void displayMenuPrice(double price){
        double eggPrice = 100;
        double teaPrice = 50;

        System.out.println("Egg price at khandhaba hotel is "+eggPrice);
        System.out.println("Tea price at khandhaba hotel is "+teaPrice);
        System.out.println("Your order bill become "+(eggPrice+teaPrice));
    }


    public static void main(String args[]){
        Hotel khanDhaba = new Hotel();
        khanDhaba.name = "Khan Dhaba";
        khanDhaba.location = "Shah Town";
        khanDhaba.breakFastMenu = "Paratha,Egg,Tea";

        System.out.println("Hotel Object>>>>>");
        System.out.println("Name:"+khanDhaba.name);
        System.out.println("Location:"+khanDhaba.location);
        System.out.println("Menu:"+khanDhaba.breakFastMenu);
        khanDhaba.displayMenuPrice(150);




        Hotel larakanHotel = new Hotel();
        larakanHotel.name = "Larkana Hotel";
        larakanHotel.location = "Gulstan e Johar";
        larakanHotel.lunchMenu = "Chicken Fajita,Haleem,Nihari,";
        
        System.out.println(" ");
        System.out.println("Name:"+larakanHotel.name);
        System.out.println("Location:"+larakanHotel.location);
        System.out.println("Menu:"+larakanHotel.lunchMenu);
       

        Hotel zamZama = new Hotel();
        zamZama.name = "ZamZama";
        zamZama.location = "Gulshane e Hadeed";
        zamZama.dinnerMenu = "Handi,Qorma,Tea,Burger,Daal";

       System.out.println(" ");
        System.out.println("Name:"+zamZama.name);
        System.out.println("Location:"+zamZama.location);
        System.out.println("Menu:"+zamZama.dinnerMenu);



        Hotel alHamara = new Hotel();
        alHamara.name = "Al_Hamara";
        alHamara.location = "Burns Road Sadar karachi";
        alHamara.beveragesMenu = "Soft Drink,Juice,Tea/Coffee";

        System.out.println("");
        System.out.println("Name:"+alHamara.name);
        System.out.println("Location:"+alHamara.location);
        System.out.println("Menu:"+alHamara.beveragesMenu);

      

        
}

 }