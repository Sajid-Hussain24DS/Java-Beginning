import java.util.ArrayList;
import java.util.List;

public class StudentTest {
        public static void main(String[] args) {




            // Integer Array List
            ArrayList<Integer> integerArrayList = new ArrayList<>();
            integerArrayList.add(50);
            integerArrayList.add(60);
            integerArrayList.add(70);
            integerArrayList.add(80);
            integerArrayList.add(90);
            integerArrayList.add(100);
            integerArrayList.remove(0);
            for(int i=0; i<integerArrayList.size(); i++){
                System.out.println(integerArrayList.get(i));

            }
            // dynamic method dispatching
            List list = new ArrayList();
            list.add("Sajid");
            list.add(7);
            list.add('f');
            list.add(465.9);
            list.add("Shahid");
            list.add("true");
            list.remove("Shahid");
            System.out.println(list);
            System.out.println(list.size()); // check size of list
            System.out.println(list.contains("Sajid")); //To check if a specific value or object is present in a List, you can use the contains() method in Java.


            // List only Print Number Or Generic list
            List<Integer> numbers = new ArrayList();
            numbers.add(84);
            numbers.add(70);
            numbers.add(80);
            numbers.add(90);
            numbers.add(50);
            numbers.add(30);
            numbers.add(20);
            numbers.add(10);
            numbers.add(710);
            numbers.add(700);
            numbers.add( Integer.parseInt("70")); // it converet String to
            System.out.println(numbers);
            System.out.println(numbers.size());

             // Double List
            List<Double> decimal = new ArrayList();
            decimal.add(5.5);
            decimal.add(Double.parseDouble("56"));
            System.out.println(decimal);

            //String list
            List<String> strings = new ArrayList<>();
            strings.add("Ali");
            strings.add("Ahmad");
            strings.add("Afzal");
            strings.add("Akib");
            System.out.println(strings);
            System.out.println(strings.size());




// here i make student list

            List<Student>students = new ArrayList<>();
            Student student1 = new Student();
            student1.setName("Sajid Hussain");
            student1.setAge("19");
            student1.setId("35627");


            Student student2 = new Student();
            student2.setName("Mudasir");
            student2.setAge("20");
            student2.setId("1223");

            // this object is Student that i made student class without parameter
            Student student3 = new Student();
            student3.setName("Habib");
            student3.setAge("20");
            student3.setId("1234");

            students.add(student1);
            students.add(student2);
            students.add(new Student("1234","ali", "12"));  // this is constructor
            students.add(student3);
            System.out.println(students);
        }


    }
