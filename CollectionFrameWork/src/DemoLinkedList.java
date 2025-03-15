import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DemoLinkedList {
    public static void  main(String[] args) {

        List<Integer> number = new LinkedList<>();
        number.add(23);
        number.add(24);
        number.add(25);
        number.add(26);
        System.out.println(number);

      //  number.remove(3);
      //  System.out.println(number.isEmpty());
        // Iterate through loop
     //   for (int i=0;i<number.size();i++){
          //  System.out.println(number.get(i));
      //  }

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
        students.add(student3);
        students.add(new Student("1234","ali", "12"));  // this is constructor
        System.out.println(students);

        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6) ;
        List<Integer> nums = new LinkedList<>(arrayList); // array list convert to linked list
        nums.addAll(number);
        System.out.println(nums);

        List<Integer> arrayList2 = new ArrayList<>(nums); // linked list to array list
        System.out.println(arrayList2);
    }

    }

