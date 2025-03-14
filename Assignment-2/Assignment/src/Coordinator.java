public class Coordinator extends HeadOfDepartment{
private String coordinatorName;
private String coordinatorId;
private String coordinatorContact;

    public Coordinator(String hodName, String departmentName, String officeNumber,
                       String contactNumber,String coordinatorName,String coordinatorId,String coordinatorContact) {
        super(hodName, departmentName, officeNumber, contactNumber,coordinatorName,coordinatorId,contactNumber);
        this.coordinatorName = coordinatorName;
        this.coordinatorId= coordinatorId;
        this.coordinatorContact = coordinatorContact;

    }

    public String getCoordinatorName() {
        return coordinatorName;
    }

    public void setCoordinatorName(String coordinatorName) {
        this.coordinatorName = coordinatorName;
    }

    public String getCoordinatorId() {
        return coordinatorId;
    }

    public void setCoordinatorId(String coordinatorId) {
        this.coordinatorId = coordinatorId;
    }

    public String getCoordinatorContact() {
        return coordinatorContact;
    }

    public void setCoordinatorContact(String coordinatorContact) {
        this.coordinatorContact = coordinatorContact;

    }
    public void displayInformation() {
        super.displayInformation(); // Call the display method of HeadOfDepartment
        System.out.println("Coordinator Name: " + getCoordinatorName());
        System.out.println("Coordinator ID: " + getCoordinatorId());
        System.out.println("Coordinator Email: " + getCoordinatorContact());
}
}
