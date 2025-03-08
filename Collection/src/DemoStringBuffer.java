import java.sql.Time;
import java.text.DateFormat;
import java.time.Month;
import java.util.Date;

public class DemoStringBuffer {

    public static final String UNIVERSITY = "DUET"; // this is constant

    public static void main(String[] args) {

        String str = "Hello"; // literal
        System.out.println("String " +str);
        str.concat(" World");
        System.out.println("String Simple :" +str);

        final int a;
        a= 50;
        int b = 40;
        b = 45;
        b= 55;
        //System.out.println(a);
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println("String Buffer :" +sb);
        sb.append(" World");
        System.out.println("String Buffer Change :" +sb);

        StringBuilder sbd = new StringBuilder("hello");
        sbd.append(" world");
        System.out.println("String Builder :"+sbd);

        Date date = new Date();
        System.out.println(date);

        System.out.println("Check Time of String");
        String str1 = new String("Hello");
        long  startTime = System.currentTimeMillis();
        for(int i=0; i<=10000; i++){
            str1 = str1+"World"; // Here, the world is added to 'Hello'

        }
        long endTime = System.currentTimeMillis();
        long TotalTime = endTime-startTime;
        System.out.println("String Time :"+TotalTime);



        StringBuffer sb1 = new StringBuffer("Hello");
         startTime = System.currentTimeMillis();
        for(int i=0; i<=100000; i++){
             sb1.append("Saain"); // Here, the Saain is added to 'Hello'

        }
        endTime = System.currentTimeMillis();
        long TotalTime1 = endTime - startTime;
        System.out.println("String Buffer Time :"+TotalTime1);

        StringBuilder sbd1 = new StringBuilder("Hello");
        startTime = System.currentTimeMillis();
        for(int i=0; i<=1000000; i++){
            sb1.append("World"); // Here, the World is added to 'Hello'

        }
        endTime = System.currentTimeMillis();
        long TotalTime2 = endTime-startTime;
        System.out.println("String  Builder Time :"+TotalTime2);



    }
}
