import java.util.*;

public class DemoSet {
    public static void main(String[] args) {


        Set<Integer> number = new HashSet<>();
        Set<Integer> number1 = new HashSet<> (number);
        number.add(1);
        number.add(2);
        number.add(3);
        number.add(4);
        number.add(5);
        number.add(6);
        number.add(6); number.add(6); number.add(6); number.add(6); number.add(6);
        number.add(null);
        number.add(null);
        System.out.println(number);
        System.out.println(number1);

        System.out.println(" Hash Set>>>>>>>>>>>>>>>.");
        Set<Student> students = new HashSet<>();
        Student student1 = new Student();
        student1.setName("Sajid Hussain");
        student1.setAge("19");
        student1.setId("35627");


        Student student2 = new Student();
        student2.setName("Mudasir");
        student2.setAge("20");
        student2.setId("1223");


        Student student3 = new Student();
        student3.setName("Habib");
        student3.setAge("20");
        student3.setId("1234");

        Student s4 = new Student("1234","ali", "12");
        Student s5 = s4;

        students.add(student1);
        students.add(student2);
        students.add(new Student("1234","ali", "12"));
        students.add(student3);
        students.forEach(student -> {
            System.out.println(student.getName());
            System.out.println(student.getAge());
            System.out.println(student.getId());
        });
        System.out.println(s5);
        System.out.println("Sorted set");
        SortedSet<Integer> sortedSet = new TreeSet<>();
        sortedSet.add(2);
        sortedSet.add(1);
        sortedSet.add(5);
        sortedSet.add(4);
        sortedSet.add(6);
        System.out.println(sortedSet);
        System.out.println(sortedSet.first());
        System.out.println(sortedSet.last());


    }
    }





