import java.util.ArrayList;
import java.util.List;

public class ComputerTest {
    public static void main(String[] args) {
        List<Computer>computers = new ArrayList<>();
        Computer comp1 = new Computer("Dell", "Intel i7", 16);
        Computer comp2 = new Computer("HP", "AMD Ryzen 5", 8);
        Computer comp3 = new Computer("Lenovo", "Intel i5", 12);
        Computer comp4 = new Computer("Apple", "M1 Chip", 16);
        Computer comp5 = new Computer("Asus", "Intel i9", 32);
        Computer comp6 = new Computer("Acer", "Intel i7", 16);
        Computer comp7 = new Computer("MSI", "AMD Ryzen 7", 16);
        Computer comp8 = new Computer("Razer", "Intel i7", 16);
        Computer comp9 = new Computer("Microsoft", "Intel i5", 8);
        Computer comp10 = new Computer("Alienware", "Intel i9", 64);
        computers.add(comp1);
        computers.add(comp2);
        computers.add(comp3);
        computers.add(comp4);
        computers.add(comp5);
        computers.add(comp6);
        computers.add(comp7);
        computers.add(comp8);
        computers.add(comp9);
        computers.add(comp10);
        System.out.println(computers);

    }
}
