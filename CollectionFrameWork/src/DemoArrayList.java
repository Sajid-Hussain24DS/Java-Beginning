import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DemoArrayList {
    public static void main(String[] args) {
        List<Integer> numbers1 = new ArrayList<>(400);
        numbers1.add(10);
        numbers1.add(20);
        numbers1.add(30);
        numbers1.add(40);
        numbers1.add(50);

        System.out.println(numbers1);

        List<Integer>numbers2 = new ArrayList<>();
        numbers2.add(10);
        numbers2.add(20);
        boolean result = numbers2.addAll(numbers1); // method to check value are added or not
        numbers2.addAll(2,numbers1); // Method to add value help of index

        System.out.println(result);
        System.out.println(numbers2);


        List<Student>students = new ArrayList<>();
        Student student1 = new Student();
        student1.setName("Sajid Hussain");
        student1.setAge("19");
        student1.setId("35627");


        Student student2 = new Student();
        student2.setName("Mudasir");
        student2.setAge("20");
        student2.setId("1873");

        // this object is Student that i made student class without parameter
        Student student3 = new Student();
        student3.setName("Habib");
        student3.setAge("20");
        student3.setId("874");

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(new Student("234","ali", "12"));  // this is constructor

        // how to remove value from any object
        for(int i=0; i<students.size(); i++){
            if(students.get(i).getId().equals("234"));
            students.remove(students.get(i));


        }
        System.out.println(students);

    }
}
