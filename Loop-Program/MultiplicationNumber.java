import java.util.Scanner;
class  MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the NUmber n to generate Multiplication table: ");
        int n = scanner.nextInt();

        System.out.println("Generate the Multiplication table for " + n +":");
        for (int i = 1; i <= 10; i++) {
            int result = n * i;
            // Result
            System.out.println(n + " x " + i + "=" + result);

        }
    }
}