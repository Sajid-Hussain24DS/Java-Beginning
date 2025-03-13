import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ScientificCalculator calc = new ScientificCalculator();

        while (true) {
            System.out.println("\n1. Calculate Sin");
            System.out.println("2. Calculate Cos");
            System.out.println("3. Calculate Tan");
            System.out.println("4. Calculate Sum, Avg, Max, Min of array");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter angle in radians: ");
                    System.out.println("Sin: " + calc.calculatesin(scanner.nextDouble()));
                    break;
                case 2:
                    System.out.print("Enter angle in radians: ");
                    System.out.println("Cos: " + calc.calculatecos(scanner.nextDouble()));
                    break;
                case 3:
                    System.out.print("Enter angle in radians: ");
                    System.out.println("Tan: " + calc.calculatetan(scanner.nextDouble()));
                    break;
                case 4:
                    System.out.print("Enter number of elements in array: ");
                    int n = scanner.nextInt();
                    int[] numbers = new int[n];
                    System.out.println("Enter " + n + " numbers:");
                    for (int i = 0; i < n; i++) numbers[i] = scanner.nextInt();
                    calc.calculateSumAvgMaxMin(numbers);
                    break;
                case 5:
                    System.out.println("Exiting");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
