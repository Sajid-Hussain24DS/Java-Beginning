import java.util.ArrayList;
import java.util.List;

public class HouseTest {
    public static void main(String[] args) {
        List<House>houses = new ArrayList<>();
        House house1 = new House("123 Main St", 3, 250000);
        House house2 = new House("456 Oak St", 4, 350000);
        House house3 = new House("789 Pine St", 5, 450000);
        House house4 = new House("101 Maple St", 2, 200000);
        House house5 = new House("202 Birch St", 3, 280000);
        House house6 = new House("303 Cedar St", 4, 380000);
        House house7 = new House("404 Elm St", 3, 330000);
        House house8 = new House("505 Willow St", 2, 220000);
        House house9 = new House("606 Redwood St", 4, 400000);
        House house10 = new House("707 Cedarwood St", 5, 500000);
        houses.add(house1);
        houses.add(house2);
        houses.add(house3);
        houses.add(house4);
        houses.add(house5);
        houses.add(house6);
        houses.add(house7);
        houses.add(house8);
        houses.add(house9);
        houses.add(house10);
        System.out.println(houses);

    }
}
