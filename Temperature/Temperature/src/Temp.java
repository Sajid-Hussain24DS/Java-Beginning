import java.util.Scanner;
public class Temp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1:Convert Fahrenheit to Celsius");
        System.out.println("2:Convert Celsius to Fahrenheit");
        System.out.println("3: Enter your choice 1 or 2");
        int choice = scanner.nextInt();
        float result;
        if(choice==1){
            System.out.print("Enter Temperature in Fahrenheit");
            float fahrenheit = scanner.nextFloat();
            // Fahrenheit to Celsius
            result = (fahrenheit-32) * 5 / 9;
            System.out.println(fahrenheit + " Fahrenheit is " + result + " Celsius.");

        } else if (choice==2) {
            System.out.print("Enter  Temperature in Celsius ");
            float Celsius = scanner.nextFloat();
            // Celsius  to Fahrenheit
            result = (Celsius * 5 / 9) +32;
            System.out.println(Celsius + " Celsius is " + result + " Fahrenheit.");
        }else {
            System.out.println("Invalid option.Please chose valid option");
        }

    }
}
