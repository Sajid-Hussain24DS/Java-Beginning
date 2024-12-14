import java.util.Scanner;
public class ReverseAllArray {
    public static void main(String[] args) {
        int num[] = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        for(int i=0; i<5; i++) {
            num[i] = scanner.nextInt();
        }
        System.out.println("Reverse the sum of all array");
        for(int i=4; i>=0; i--) {
            System.out.println(num[i]+ " ");
            
        

    }
}
}
    
        