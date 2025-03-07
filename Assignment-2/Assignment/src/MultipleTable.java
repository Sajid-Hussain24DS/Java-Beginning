import java.util.Scanner;

public class MultipleTable {


    void displayMultiples(int number) {

        for (int i = 1; i <= 20; i++) {
            for (int j = 1; j <= 10; j++) {

                int multiple = number * (i * j);
                System.out.print(multiple + " ");
            }
            System.out.println();
         }
     }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number:");
        int number = scanner.nextInt();
        if (number <= 0) {
            System.out.println("Enter a positive number");
        } else {
            MultipleTable table = new MultipleTable();
            table.displayMultiples(number);
        }
    }
}
