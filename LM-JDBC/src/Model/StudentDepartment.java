package Model;

public class StudentDepartment {

    private String studentName;
    private String deptName;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    @Override
    public String toString() {
        return "StudentDepartment{" +
                "studentName='" + studentName + '\'' +
                ", deptName='" + deptName + '\'' +
                '}';
    }
}
