import java.util.Scanner;
class MathWorld {
    Scanner scanner = new Scanner(System.in);

    public void displayMenu() {
        System.out.println("Welcome the MathWorld Menu>");
        System.out.println("1: Check even Odd");
        System.out.println("2: Generate Table");
        System.out.println("3: Calculate Factorial");
        System.out.println("4: Reverse the Number");
        System.out.println("5: Check the Perfect Number");
        System.out.println("6: Print all the Factors");
        System.out.println("7: Generate the Pascal Triangle Till the given number");
        System.out.println("8: check Palidrome number");
        System.out.println("9: Generate a diamond Pattern till the given number");
        System.out.println("10: Calculate Square of Number");
    }

    public void checkEvenOdd (int number){
        if (number % 2 == 0) {
            System.out.println(number + "is even number");
        } else {
            System.out.println(number + "is odd number");
        }
    }
    public void generateTable (int number){
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + "*" + i + "=" + (number * i));
        }
    }
    public void calculateFactorial(int number) {
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println("The Factorial Of " + number + " is " + factorial);
    }

    public void reverseNumber (int number) {
        int reverse = 0;
        while (number!=0){
            int digit = number % 10;
            reverse = number*10+digit;
            number /=10;
        }
        System.out.println("The reverse numbers: "+reverse);
    }

    public void checkPerfectNumber(int number){
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        if (sum == number) {
            System.out.println(number + " is a perfect number");
        } else {
            System.out.println(number + " is not a perfect number");
        }
    }
    public void printAllFactors(int number) {
        System.out.println("Factors of " + number + " are:");
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }
    }
    public void pascalTriangle(int row){
        for(int i=0; i<row; i++) {
            for(int j=0; j < row-i-1; j++) {
                System.out.print(" ");
            }
            int number = 1;
            for(int k=0; k<=i; k++) {
                System.out.print(number +" ");
                number = number*(i-k)/(k+1);
            }

            System.out.println();
        }
    }
    public void checkPalindromeNumber(int number) {
        int reverse = 0;
        int temp = number;
        while (temp != 0) {
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp /= 10;
        }
        if (reverse == number) {
            System.out.println(number + " is a palindrome number");
        } else {
            System.out.println(number+"is not a pelindrom number.");
        }
    }

    public void diamondShape(int row){
        for(int i=1; i<= row; i++) {
            for(int j=row; j>=i; j--) {
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++) {
                System.out.print(i+" ");
            }

            System.out.println();
        }
        for(int i=row; i>=1; i--) {
            for(int j=row; j>=i; j--) {
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++) {
                System.out.print(i+" ");
            }

            System.out.println();
        }
    }

    public void calculateSquare(int number) {
        int square = number * number;
        System.out.println("Square of " + number + " is " + square);
    }

    public void run(){
        boolean repeat = true;
        while (repeat){
            displayMenu();
            System.out.println("Enter your choice:");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter a number: ");
                    int num1 = scanner.nextInt();
                    checkEvenOdd(num1);
                    break;
                case 2:
                    System.out.print("Enter a number: ");
                    int num2 = scanner.nextInt();
                    generateTable(num2);
                    break;
                case 3:
                    System.out.print("Enter a number: ");
                    int num3 = scanner.nextInt();
                    calculateFactorial(num3);
                    break;
                case 4:
                    System.out.print("Enter a number: ");
                    int num4 = scanner.nextInt();
                    reverseNumber(num4);
                    break;
                case 5:
                    System.out.print("Enter a number: ");
                    int num5 = scanner.nextInt();
                    checkPerfectNumber(num5);
                    break;
                case 6:
                    System.out.print("Enter a number: ");
                    int num6 = scanner.nextInt();
                    printAllFactors(num6);
                    break;
                case 7:
                    System.out.print("Enter a number: ");
                    int num7 = scanner.nextInt();
                    pascalTriangle(num7);
                    break;
                case 8:
                    System.out.print("Enter a number: ");
                    int num8 = scanner.nextInt();
                    checkPalindromeNumber(num8);
                    break;
                case 9:
                    System.out.print("Enter a number: ");
                    int num9 = scanner.nextInt();
                    diamondShape(num9);
                    break;
                case 10:
                    System.out.print("Enter a number: ");
                    int num10 = scanner.nextInt();
                    calculateSquare(num10);
                    break;
                default:
                    System.out.println("Sorry your choice is inlvalid");
                    continue;
            }
                    System.out.println("Do you want to Continue? (yes/Yes/no/No)");
            String response = scanner.next();
            if(response.equalsIgnoreCase("no")) {
                repeat = false;
            }
        }
          System.out.println("Thank for using our MathWorld Service: Goodby.");

            }
        }
        
 public class Main{
public static void main(String[] args){
     MathWorld mathWorld = new MathWorld();
     mathWorld.run();
 }

}


