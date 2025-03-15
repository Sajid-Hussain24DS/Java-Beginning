import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class DemoIterateList {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Ali");
        strings.add("Ahmed");
        strings.add("Ayaan");
        strings.add("Asif");
        System.out.println(strings);

        // 2nd Method
        for (int i =0;i<strings.size();i++){
            System.out.println(strings.get(i));
        }

        // 3rd Method
        System.out.println("For Each Method");
        strings.forEach(s -> {
            System.out.println(s);
        });

        // 4th Method
        System.out.println("For Each Loop / Collection Based For Loop");
        for(String s: strings){
            System.out.println(s);
        }

        System.out.println("Iterator Method");
        Iterator<String> itr = strings.iterator();
        System.out.println(itr.hasNext()); // it check that value are present or not
        while (itr.hasNext())
            System.out.println(itr.next());
      //  System.out.println(itr.next());
       // System.out.println(itr.next());
       // System.out.println(itr.next());


        System.out.println("Iterator ForEachRemaining Method");
    //    Iterator<String> itr1 = strings.iterator();
     //   itr1.forEachRemaining(remaining ->{
        //    System.out.println(remaining);
     //   });


        ListIterator<String> listIterator = strings.listIterator();
      //  System.out.println(listIterator.next());
      //  System.out.println(listIterator.next());
     //   System.out.println(listIterator.previous());
     //   System.out.println(listIterator.previous());

        System.out.println("ListIterator Interface Forward Direction Method");
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
        System.out.println("ListIterator Interface Backward Direction Method");
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
    }
}
}
