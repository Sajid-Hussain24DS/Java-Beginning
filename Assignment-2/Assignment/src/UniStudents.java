public class UniStudents extends Faculties{
    private String studentName;
    private String StudentId;
    private String studentDepartment;
    private String StudentEmail;

    public UniStudents(String hodName, String departmentName, String officeNumber, String contactNumber, String coordinatorName, String coordinatorId,
                       String coordinatorEmail, String facultyName, String facultyId,
                       String facultyDesignation,String studentName,String studentId,String studentDepartment,String studentEmail) {
        super(hodName, departmentName, officeNumber, contactNumber, coordinatorName,
                coordinatorId, coordinatorEmail, facultyName, facultyId, facultyDesignation);
        this.studentName = studentName;
        this.StudentId = studentId;
        this.studentDepartment = studentDepartment;
        this.StudentEmail = studentEmail;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentId() {
        return StudentId;
    }

    public void setStudentId(String studentId) {
        StudentId = studentId;
    }

    public String getStudentDepartment() {
        return studentDepartment;
    }

    public void setStudentDepartment(String studentDepartment) {
        this.studentDepartment = studentDepartment;
    }

    public String getStudentEmail() {
        return StudentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        StudentEmail = studentEmail;
    }
    public void displayInformation() {
        super.displayInformation(); // Call the display method of Faculties
        System.out.println("Student Name: " + getStudentName());
        System.out.println("Student ID: " + getStudentId());
        System.out.println("Student Age: " + getStudentDepartment());
        System.out.println("Student Major: " + getStudentId());
}
}
