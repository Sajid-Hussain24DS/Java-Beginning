import java.util.Scanner;
public class CountFactor {
    public static void main(String[] args) {
        int num[] = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        for(int i=0; i<5; i++) {
            num[i] = scanner.nextInt();
        }
        
        for(int i=0; i<5; i++) {
            int num1 = num[i];
            int count = 0;
            int j;
            for(j = 1; j<=num1; j++) {
                if(num1 % j==0) {
                    count++; 
           
                }
            }
            
        System.out.println("factros"+num1+"is"+count);

    }
}
}
    
        