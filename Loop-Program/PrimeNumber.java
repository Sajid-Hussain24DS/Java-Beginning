import java.util.Scanner;
class   PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the NUmber n to check given number is prime or not: ");
        int n = scanner.nextInt();

        boolean isPrime = true;

        if (n <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;

                    break;

                }
            }

        }
    if (isPrime) {
        System.out.println(n + "is prime number");

    }else {
        System.out.println(n +"is not prime number");
    }
}

}