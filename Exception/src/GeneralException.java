
public class GeneralException {
    public static void main(String[] args) {

        try {
            int a = 10;
            int b = 20;
            int number3 = 0;
            int number4 = 10;
            System.out.println("Addition =" + (a + b));
            System.out.println("Division =" + (number4 / number3));
        } catch (ArithmeticException z) {
            System.out.println("Arithmetic :" + z.getMessage());
            String str2 = "Sajid";
            int arr1[] = {4, 3, 5, 7, 2, 6, 8,};
            System.out.println("String index :" + str2.charAt(1));
            System.out.println("Value at Index :" + arr1[76]);
        // I have intentionally set the array length  higher in this code to check for an exception
        }
        catch (Exception w){
            System.out.println("Exception handled : " +w.getMessage());
        }
        finally {
            System.out.println("This Finlay block");
        }
    }
}

