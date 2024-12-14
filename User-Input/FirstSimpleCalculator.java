import java.util.Scanner;
class FirstSimpleCalculator {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter first number:");
        int num1 = s.nextInt();
        System.out.println("Enter second number:");
        int num2 = s.nextInt();
        System.out.println("Enter third number:");
        int num3 = s.nextInt();
        System.out.println("Enter fourth number:");
        int num4 = s.nextInt();

        System.out.println("1-Addition");
        System.out.println("2-Multiplication");
        System.out.println("3-Subtraction");
        System.out.println("4-Division");
        System.out.println("Enter your choice: ");
        int choice = s.nextInt();
        switch (choice) {
            case 1:
                int sum = num1+num2+num3+num4;
                System.out.println("Adittion" + sum);
                break;

            case 2:
                int product = num1*num2*num3*num4;
                System.out.println("Multiplication" + product);
                break;

            case 3:
                int difference = num1-num2-num3-num4;
                System.out.println("Substraction" + difference);
                break;

            case 4:
                int division = num1 / num2 / num3 / num4;
                System.out.println("Division" + division);
                break;
            default:
                System.out.println("Select valid choice");

                break;




        }
    }
}



