package abstraction;

public class Test {
    public static void main(String[] args) {
        System.out.println("<<<<<<<<<<<Bike Details>>>>>>>>>>>");
        Vehicle bike = new Bike();
        bike.setModel("2020");
        bike.setName("CD 70");
        bike.maxSpeed();
        bike.show();
        System.out.println("");

        System.out.println("<<<<<<<<<<<<<<Car Detail>>>>>>>>>>");
        Vehicle car = new Car();
        car.setModel("2024");
        car.setName("Civic Honda");
        car.maxSpeed();
        car.show();
        System.out.println("");

        System.out.println("<<<<<<<<<<<Manager details>>>");
        Employee manager = new Manager();
        manager.setName("Shahid Hussain");
        manager.setIdNumber("bc348784");
        manager.display();
        manager.salary();
        System.out.println("");


        System.out.println("<<<<<<<<<<<Developer Detail>>>>");
        Employee developer = new Developer();
        developer.setName("Sajid Hussain");
        developer.setIdNumber("dv438784");
        developer.display();
        developer.salary();
        System.out.println("");

        System.out.println("<<<Intern details>>");
        Employee intern = new Intern();
        intern.setName("Mudasir Ali");
        intern.setIdNumber("abd83474");
        intern.display();
        intern.salary();

        System.out.println("Saving account detail.");
        Account saving = new SavingAccount();
        saving.setAccountHolderName("Habib Ali");
        saving.setBalance(700000);
        saving.AccountNumber();
        saving.detail();
        System.out.println("");

        System.out.println("Current account detail.");
        Account current = new CurrentAcount();
        current.setAccountHolderName("Farhan Ali");
        current.setBalance(800000);
        current.AccountNumber();
        saving.detail();
        System.out.println("");

        System.out.println("Deposit account detail.");
        Account deposit = new DepositAccount();
        deposit.setAccountHolderName("Hasseb Ali");
        deposit.setBalance(900000);
        deposit.AccountNumber();
        deposit.detail();
        System.out.println("");

        System.out.println("Shape Details");
        Shape rectangle = new Rectangle();
        rectangle.Name();
        rectangle.setSides(12);
        rectangle.setAngle(90);
        rectangle.setPerimeter(23);
        rectangle.ShapeDetails();
        System.out.println("");

        Shape square = new Square();
        square.Name();
        square.setSides(12);
        square.setAngle(90);
        square.setPerimeter(23);
        square.ShapeDetails();
        System.out.println("");

        Shape triangle = new Triangle();
        triangle.Name();
        triangle.setSides(12);
        triangle.setAngle(90);
        triangle.setPerimeter(23);
        triangle.ShapeDetails();




    }
}
