import java.util.*;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
        List<EmployeeManagment> employees = new ArrayList<>();
        employees.add(new EmployeeManagment("Habib", 65000, "IT"));
        employees.add(new EmployeeManagment("Huzafia", 45000, "HR"));
        employees.add(new EmployeeManagment("Muqeet", 38000, "Finance"));
        employees.add(new EmployeeManagment("Karim", 75000, "IT"));
        employees.add(new EmployeeManagment("Aishaa", 52000, "Marketing"));
        System.out.println("==============Employee Salary Management System===============");

        employees.stream()
                .filter(e -> e.getSalary() > 40000)
                .sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()))
                .map(employee -> {
                    employee.displayInfo();
                    return employee;
                })
                .collect(Collectors.toList());
    }
}