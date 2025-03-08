public class DemoArithmeticException {
    public static void main(String[] args) {
        try {
            int number1 = 10;
            int number2 = 20;
            System.out.println("Addition =" + (number1 + number2));

        }catch (ArithmeticException d) {
            System.out.println("Addition Exception"+d.getMessage());
        }
        try {
            int number3 = 0;
            int number4 = 10;
            System.out.println("Division =" + number4 / number3);
        }catch (ArithmeticException d){
            System.out.println("Division Error Exception = "+d.getMessage());
        }
        try {
            int number5 = 10;
            int number6 = 20;
            System.out.println("Multiplication = "+number5*number6);
        }catch (ArithmeticException d){
            System.out.println("Multiplication Exception :"+d.getMessage());
        }
    }
}
