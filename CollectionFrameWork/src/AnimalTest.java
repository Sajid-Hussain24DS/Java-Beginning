import java.util.ArrayList;
import java.util.List;

public class AnimalTest {
    public static void main(String[] args) {
        List<Animal>animals=new ArrayList<>();
        Animal animal1 = new Animal("Lion", 5);
        Animal animal2 = new Animal("Elephant", 10);
        Animal animal3 = new Animal("Dog", 3);
        Animal animal4 = new Animal("Cat", 2);
        Animal animal5 = new Animal("Tiger", 6);
        Animal animal6 = new Animal("Horse", 7);
        Animal animal7 = new Animal("Giraffe", 8);
        Animal animal8 = new Animal("Zebra", 4);
        Animal animal9 = new Animal("Monkey", 3);
        Animal animal10 = new Animal("Bear", 12);
        animals.add(animal1);
        animals.add(animal2);
        animals.add(animal3);
        animals.add(animal4);
        animals.add(animal5);
        animals.add(animal6);
        animals.add(animal7);
        animals.add(animal8);
        animals.add(animal9);
        animals.add(animal10);
        System.out.println(animals);
    }
}
