package  Model;

public class Student {
    private int studentId;
    private String name;
    private String rollNumber;
    private Department department;

    public Student() {}
    public Student(int studentId, String name, String rollNumber, Department department) {
        this.studentId = studentId;
        this.name = name;
        this.rollNumber = rollNumber;
        this.department = department;
    }

    public int getStudentId() { return studentId; }
    public void setStudentId(int studentId) { this.studentId = studentId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getRollNumber() { return rollNumber; }
    public void setRollNumber(String rollNumber) { this.rollNumber = rollNumber; }

    public Department getDepartment() { return department; }
    public void setDepartment(Department department) { this.department = department; }

    @Override
    public String toString() {
        return "Student{" +
                "ID=" + studentId +
                ", Name='" + name + '\'' +
                ", Roll='" + rollNumber + '\'' +
                ", Department=" + department +
                '}';
    }
}
