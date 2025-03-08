import java.lang.reflect.Array;

public class DemoArrayException {
        public static void main(String[] args) {

            try {
                int arr[] = {10,20,30,40,50,60,70};
                System.out.println("Value at Index :"+arr[10]);

            }
            catch(ArrayIndexOutOfBoundsException c){
                System.out.println("Index Error :"+c.getMessage());


            }
            try {
                int arr[] = {10,20,30,40,};
                System.out.println("Value at Index :"+arr[3]);
            }
            catch(ArrayIndexOutOfBoundsException c){
                System.out.println("Find Index  :"+c.getMessage());
            }




        }
}





