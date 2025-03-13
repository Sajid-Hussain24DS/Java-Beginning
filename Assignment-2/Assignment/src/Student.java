import java.util.Scanner;
public class Student {

    String firstName;
    String lastName;
    String studentId;
    String contact;
    String city;
    String dob;
    int currentSemester;
    int courseEnrolled;

    public Student(String firstName, String lastName, String StudentId,
                   String contact, String city, String dob, int currentSemester, int courseEnrolled) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentId = studentId;
        this.contact = contact;
        this.city = city;
        this.dob = dob;
        this.currentSemester = currentSemester;
        this.courseEnrolled = courseEnrolled;

    }

    public void display() {
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Student I'D: " + studentId);
        System.out.println("Contact Number: " + contact);
        System.out.println("City: " + city);
        System.out.println("Date Of Birth: " + dob);
        System.out.println("Current Semester: " + currentSemester);
        System.out.println("Course Enrolled: " + courseEnrolled);


    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[8];

        for (int i = 0; i < students.length; i++) {

            System.out.println("Enter detail for Students ");

            System.out.print("Enter First Name: ");
            String firstName = scanner.nextLine();

            System.out.print("Enter Last Name: ");
            String lastName = scanner.nextLine();

            System.out.print("Enter Student I'D: ");
            String studentID = scanner.nextLine();

            System.out.print("Enter Contact Number: ");
            String contact = scanner.nextLine();

            System.out.print("Enter City: ");
            String city = scanner.nextLine();

            System.out.print("Enter Date of Birth: ");
            String dob = scanner.nextLine();

            System.out.print("Enter Current Semester: ");
            int currentSemester = scanner.nextInt();

            System.out.print("Enter Number of Course Enrolled: ");
            int courseEnrolled = scanner.nextInt();
            scanner.nextLine();
            students[i] = new Student(firstName, lastName, studentID, contact,
                    city, dob, currentSemester, courseEnrolled);
        }


        for (int i = 0; i < students.length; i++) {
            students[i].display();
            System.out.println();
        }
        scanner.close();
    }
}


