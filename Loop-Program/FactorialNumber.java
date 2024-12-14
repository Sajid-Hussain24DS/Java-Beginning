import java.util.Scanner;
class FactorialNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Even Integer NUmber n: ");
        int n = scanner.nextInt();

        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
            // Result
            System.out.println("The Factorial Of " + n + "Even Integer number is: " + factorial);

        }
    }
}