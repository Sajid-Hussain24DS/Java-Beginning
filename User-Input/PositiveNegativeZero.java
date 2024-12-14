import java.util.Scanner;

class PositiveNegativeZero{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = scanner.nextInt();

        //Determine the number is positive negetive or zero
        if(num>0) {
            System.out.println("The given number" +num+ "is positive");

        }else if(num<0)
            System.out.println("Number is" +num+ "is negative");
        else 
        System.out.println("The Number is zero ");





    }

}
