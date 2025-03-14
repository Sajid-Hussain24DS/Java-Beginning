public class Faculties extends Coordinator{
    private String facultyName;
    private String facultyId;
    private String facultyDesignation;


    public Faculties(String hodName, String departmentName, String officeNumber, String contactNumber,
                     String coordinatorName, String coordinatorId, String coordinatorEmail,
                     String facultyName, String facultyId, String facultyDesignation) {
        super(hodName, departmentName, officeNumber, contactNumber, coordinatorName, coordinatorId, coordinatorEmail);
this.facultyName = facultyName;
this.facultyId = facultyId;
this.facultyDesignation = facultyDesignation;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public String getFacultyId() {
        return facultyId;
    }

    public void setFacultyId(String facultyId) {
        this.facultyId = facultyId;
    }

    public String getFacultyDesignation() {
        return facultyDesignation;
    }

    public void setFacultyDesignation(String facultyDesignation) {
        this.facultyDesignation = facultyDesignation;
    }
    public void displayInformation() {
        super.displayInformation(); // Call the display method of Coordinator
        System.out.println("Faculty Name: " + getFacultyName());
        System.out.println("Faculty ID: " + getFacultyId());
        System.out.println("Faculty Designation: " + getFacultyDesignation());
}
}
