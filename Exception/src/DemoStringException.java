import java.lang.Exception;

public class DemoStringException {
    public static void main(String[] args) {

        try {
            String str1 = "Sajid";
            char ch = str1.charAt(7);
            System.out.println(ch);
        }
        catch (StringIndexOutOfBoundsException a) {
            System.out.println("Error :" +a.getMessage());
        }

        String str2 = "WajidAli";
        try {
           String sub = str2.substring(9,10);
            System.out.println(sub);
        }
        catch (StringIndexOutOfBoundsException a) {
            System.out.println("Exception :" +a.getMessage());
        }


    }
}

