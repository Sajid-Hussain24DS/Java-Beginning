import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DemoSort {
     public static  void main(String[] args) {
          List<Integer> list = new ArrayList<>();

          // how to sort collection
          // we can use sort method of collection class to sort
          list.add(30);
          list.add(25);
          list.add(15);
          list.add(5);
          Collections.reverse(list);
          System.out.println("Reverse list: "+list);

          Collections.sort(list);
          System.out.println("Sort Collection: "+list);
          List<String> strings = new ArrayList<>();
          strings.add("Mohammad");
          strings.add("Sajid");
          strings.add("Hasseb");
          strings.add("Ali");
          Collections.sort(strings);
          System.out.println("String Sort"+strings);

          // Object sort

     }
     }


