import java.util.Scanner;
public class Employee {
    String name;
    int idNumber;
    float salary;

    public Employee(String name, int idNumber, float salary) {
        this.name = name;
        this.idNumber = idNumber;
       this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Name :" + this.name);
        System.out.println("I'D Number :" + this.idNumber);
        System.out.println("Salary :" + this.salary);
    }


            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                Employee[] employee = new Employee[3];
                for(int i=0;i<3;i++){
                    System.out.print("Enter Employee name: ");
                    String name = scanner.next();
                    System.out.print("Enter Employee I'D Number: ");
                    int idNumber  = scanner.nextInt();
                    System.out.print("Enter Salary: ");
                    float salary = scanner.nextFloat();

                    employee[i] = new Employee( name,idNumber,salary);

                }
                for(int i=0;i<3;i++){ // The loop prints the details that we provide.
                   employee[i].displayDetails();
                   System.out.println();
                }
                scanner.close();




        }



    }





