class Employee {
    public void work() {
        System.out.println("Employee is carrying out general task");
    }
    public double getSalary() {
        return 0;
    }
}

class HRManager extends Employee{
    @Override
    public void work() {
        System.out.println("HR Manager is handling employee relation and wellbeing:");
    }
    public void addEmployee() {
        System.out.println("HR Manager is onboarding a new employee.");
    }
}
class ProgramMain{
    public static void main(String[] args) {
        HRManager hr = new HRManager();
        hr.work();
        hr.addEmployee();
        System.out.println("HR Manager's Monthly Pay: " + hr.getSalary());
    }
}