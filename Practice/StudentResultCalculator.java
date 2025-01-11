import java.util.Scanner;
public class StudentResultCalculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Physics marks:");
        int Physics =sc.nextInt();
        System.out.println("Enter your chemistry marks:");
        int chemistry =sc.nextInt();
        System.out.println("Enter your Mathematics marks:");
        int Mathematics =sc.nextInt();
        System.out.println("Enter your English marks:");
        int English =sc.nextInt();
        System.out.println("Enter your Computer marks:");
        int Computer =sc.nextInt();

        float percentage = ((Physics+chemistry+Mathematics+English+Computer)/500.0f)*100;
        System.out.println("Your Exam Result is: " + String.format("%.2f", percentage) + "%");
    }
}