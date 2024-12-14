import java.util.Scanner;

public class PrimeNumberInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Prime numbers:");
        for (int num : numbers) {
            if (num > 1 && num % 2 != 0 && num % 3 != 0) {
                System.out.println(num);
            }
        }
    }

 }
