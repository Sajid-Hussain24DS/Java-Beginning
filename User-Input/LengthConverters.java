import java.util.Scanner;

 class LengthConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("1 Meters to Kilometer (2) Kilometers to Meters: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1: 
                System.out.print("Enter length in meters: ");
                double meters = scanner.nextDouble();
                double kilometers = meters / 1000;
                System.out.println("Length in kilometers: " + kilometers);
                break;
            case 2: 
                System.out.print("Enter length in kilometers: ");
                double kms = scanner.nextDouble();
                double metersConverted = kms * 1000;
                System.out.println("Length in meters: " + metersConverted);
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }

        
    }
}
