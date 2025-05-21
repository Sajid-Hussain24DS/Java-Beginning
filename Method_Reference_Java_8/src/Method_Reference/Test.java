package Method_Reference;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
List<Student> students = new ArrayList<>();

        Student s1 = new Student();
        s1.setName("Sajid");
        s1.setAge(19);
        s1.setId(133);

        Student s2 = new Student();
        s2.setName("Habib");
        s2.setAge(20);
        s2.setId(134);

        Student s3 = new Student();
        s3.setName("Haseeb");
        s3.setAge(25);
        s3.setId(135);

        students.add(s1);
        students.add(s2);
        students.add(s3);
            List<Student> collected = students.stream()
                    .collect(Collectors.toList());

            students.stream()
                .forEach( System.out::println);
    }

}
