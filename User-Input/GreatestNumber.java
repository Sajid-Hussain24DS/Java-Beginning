import java.util.Scanner;

class GreatestNumber{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter Second number: ");
        int num2 = scanner.nextInt();
        System.out.println("Enter Third number: ");
        int num3 = scanner.nextInt();

        //Determine Which one number is greater
        int greatest;
        if (num1 > num2) {
            greatest = num1;
        } else if (num2 > num3){
            greatest = num2;
        }

        if (num3 > num1) {
            greatest = num3;
            // Display the greatest one
            System.out.println("The greatest number is" +greatest);


        }

        }

    }
