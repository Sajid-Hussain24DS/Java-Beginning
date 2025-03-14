import java.util.ArrayList;
import java.util.List;

public class MobileTest {
    public static void main(String[] args) {

        List<Mobile> mobiles = new ArrayList<>();
        Mobile mobile1 = new Mobile("Samsung", "Galaxy S21", 4000);
        Mobile mobile2 = new Mobile("Apple", "iPhone 13", 3300);
        Mobile mobile3 = new Mobile("OnePlus", "9 Pro", 4500);
        Mobile mobile4 = new Mobile("Google", "Pixel 6", 5000);
        Mobile mobile5 = new Mobile("Xiaomi", "Mi 11", 4600);
        Mobile mobile6 = new Mobile("Oppo", "Reno 6", 4300);
        Mobile mobile7 = new Mobile("Realme", "GT", 5000);
        Mobile mobile8 = new Mobile("Vivo", "V21", 4000);
        Mobile mobile9 = new Mobile("Sony", "Xperia 1", 3500);
        Mobile mobile10 = new Mobile("Huawei", "P40 Pro", 4200);
        mobiles.add(mobile1);
        mobiles.add(mobile2);
        mobiles.add(mobile3);
        mobiles.add(mobile4);
        mobiles.add(mobile5);
        mobiles.add(mobile6);
        mobiles.add(mobile7);
        mobiles.add(mobile8);
        mobiles.add(mobile9);
        mobiles.add(mobile10);
        System.out.println(mobiles);
    }
}
