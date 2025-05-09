import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.List;

public class Stream_Api_Program {

    public static void main(String[] args) {


        int sum = Arrays.asList(1, 2, 3, 4).stream()
                .mapToInt(n -> n)
                .sum();
        System.out.println(sum);


        long count = Arrays.asList("cat", "tiger", "lion", "ox")
                .stream()
                .filter(s -> s.length() > 3)
                .count();
        System.out.println(count);


        int Sum = Arrays.asList(1, 2, 3, 4).stream()
                .mapToInt(n -> n)
                .sum();
        System.out.println(Sum);


        List<String> sorted = Arrays.asList("banana", "apple", "mango")
                .stream()
                .sorted((a, b) -> a.compareTo(b))
                .collect(Collectors.toList());
        System.out.println(sorted);


        List<Integer> squares = Arrays.asList(1, 2, 3)
                .stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
        System.out.println(squares);


        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        list.stream()
                .filter(n -> n % 2 != 0)
                .forEach(n -> System.out.println(n));


        List<String> names = Arrays.asList("ALICE", "BOB");
        names.stream()
                .map(s -> s.toLowerCase())
                .forEach(s -> System.out.println(s));

        List<Integer> numbers = Arrays.asList(3, 5, 9, 12);
        numbers.stream()
                .filter(n -> n % 3 == 0)
                .forEach(n -> System.out.println(n));


        List<Integer> Numbers = Arrays.asList(4, 9, 16);
        Numbers.stream()
                .map(n -> Math.sqrt(n))
                .forEach(n -> System.out.println(n));

        List<Integer> Number = Arrays.asList(-5, 3, -2, 7);
        Number.stream()
                .filter(n -> n < 0)
                .forEach(n -> System.out.println(n));


    }
}
