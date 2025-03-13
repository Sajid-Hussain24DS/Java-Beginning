import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number:");
        double num1 = scanner.nextDouble();

        System.out.print("Enter Operator:");
        char operator = scanner.next().charAt(0);

        System.out.print("Enter Second Number:");
        double num2 = scanner.nextDouble();


        double result = 0;

        if (operator == '+') {
            result = num1 + num2;
        } else if (operator == '-') {
            result = num1 - num2;
        } else if (operator == '*') {
            result = num1 * num2;
        } else if (operator == '/') {
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                System.out.println("Error: Division by zero is not allowed");
            }
        } else {
            System.out.println("Invalid Operator");

        }
        System.out.println("Answer = "+result);
    }
}