import java.util.Scanner;
public class ArrayOccurence {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        char[]array ={'a','b','b','b','a','c','c','a','c' };
        System.out.println("Enter Occurence Number to remove char from Array");
        int occurence = scanner.nextInt();
        //Sample output
        //s = "abbbcccac" -> "abbbac"-> "aac" final output
        int count=1;
        for (int i = 1; i<array.length;i++){
            if(array[i]==array[i-1]) {
                count++;
            }else {
                if (count!=occurence){
                    while (count-- >0){
                        System.out.print(array[i-1]);
                    }
                }
                count=1;
            }
        }
    }
}

