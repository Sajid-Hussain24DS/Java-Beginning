import javax.swing.*;
import java.util.*;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class Main {
    public static void main(String[] args) {

    List<Integer> numbers = Arrays.asList(1, 2, 3, 4,5);

    Collections.sort(numbers);

    for(int i =0;i<numbers.size();i++){
        System.out.println(numbers.get(i));
    }

   // Function<Integer,Integer> function = num-> num = num+1;
       System.out.println("SQ of numbers ");
        numbers.stream()
            .map(num-> num=num+1)
            .forEach(n-> System.out.println(n));

        System.out.println("Reurn sq root");
        Function<Integer,Integer> function = num-> num;


        numbers.stream().map(num->{
            if (num > 2){
                return num*num;
            }
            return num;
        }).forEach(n-> System.out.println(n));


        ToIntFunction <Integer> intFunction = (n->{
            return n+1;
        });
        numbers.stream().mapToInt(intFunction).forEach(n->System.out.println("Map To Int :"+n));

        OptionalDouble average = numbers.stream().mapToInt(n->n).average();
        average.ifPresent(n-> System.out.println(n));
        System.out.println("Average: "+average.getAsDouble());

        // OR
        double avg =  numbers.stream().mapToInt(n->n).average().getAsDouble();
        System.out.println(avg);

        int sum =  numbers.stream().mapToInt(n->n).sum();
        System.out.println("Sum 0:"+sum);

        long sum1 =  numbers.stream().mapToLong(n->n).sum();
        System.out.println("Sum 1:"+sum1);

        double sum2 =  numbers.stream().mapToDouble(n->n).sum();
        System.out.println("Sum 2:"+sum2);


       // double stream = students.stream().filter(s->s.getName().length>6);
     //   double filteredStudent = stream.mapToInt(s->.getAge()).average.getAsDouble();
    //    System.out.println("Filtered Student :" +filteredStudent);

            //Both Are SAME

        // double stream = students.stream()
        // .filter(s->s.getName().length>6)
        // .mapToInt(s->.getAge())
        // .average
        // .getAsDouble();

}
        }