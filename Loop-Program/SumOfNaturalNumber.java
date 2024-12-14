import java.util.Scanner;
class SumOfNaturalNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Natural Number n: ");
        int n = scanner.nextInt();

        int totalSum = 0;
        for (int i = 1; i <= n; i++) {
            totalSum += i;
            // Result
            System.out.println("The sum of " + n + "natural number is: " + totalSum);

        }
    }
}