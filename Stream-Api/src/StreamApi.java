import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class StreamApi {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7);
        // get through each method

        numbers.forEach((number)->{

            if (number%2==0){
                System.out.println(number);
            }
        });
    }
}
