import java.util.Scanner;

class NumberInRange{
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Define the range
       
        int uperRange = 50;
        int lowerRange = 10;

        // Verify if the number is in the range or outside it.
        if (num <= uperRange && num >= lowerRange) {
            System.out.println("The number is in the range " + num);
        } else {
            System.out.println("The number is out of range" + num);
        }



    }
}