import java.util.*;

public class DemoMap {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(23,"Shahid");
        map.put(24,"Sajid");
        map.put(25,"Zahid");
        map.put(26,"Abid");
        map.put(26,"Habib");
        map.put(null,"Sheraz");
        map.put(null,"Ahmed");

        System.out.println("Contains key");
        System.out.println(map.containsKey(25));


        System.out.println("Get Value  "  + map.get(23));


        System.out.println("Remove Value  "+ map.remove(26,"Habib"));
      //  map.remove(23);
        System.out.println(map);



        Map<Integer,String> linked = new LinkedHashMap<>();
        linked.put(3,"Ali");
        linked.put(5,"Arslan");
        linked.put(2,"Saqib");
        linked.put(1,"Ayan");
        System.out.println(linked);



        SortedMap<Integer,String> sortedMap = new TreeMap<>();
        sortedMap.put(3,"Ali");
        sortedMap.put(5,"Arslan");
        sortedMap.put(2,"Saqib");
        sortedMap.put(1,"Ayan");
        System.out.println(sortedMap);



    }


}
