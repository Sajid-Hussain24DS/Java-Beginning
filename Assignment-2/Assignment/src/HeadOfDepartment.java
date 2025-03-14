public class HeadOfDepartment {
    private String hodName;
    private String departmentName;
    private String officeNumber;
    private String contactNumber;

    public HeadOfDepartment(String hodName, String departmentName, String officeNumber, String contactNumber, String coordinatorName, String coordinatorId, String number) {
        this.hodName = hodName;
        this.departmentName = departmentName;
        this.officeNumber = officeNumber;
        this.contactNumber = contactNumber;

    }
        public String getHodName () {
            return hodName;
        }

        public void setHodName (String hodName){
            this.hodName = hodName;
        }

        public String getDepartmentName () {
            return departmentName;
        }

        public void setDepartmentName (String departmentName){
            this.departmentName = departmentName;
        }

        public String getOfficeNumber () {
            return officeNumber;
        }

        public void setOfficeNumber (String officeNumber){
            this.officeNumber = officeNumber;
        }

        public String getContactNumber () {
            return contactNumber;
        }

        public void setContactNumber (String contactNumber){
            this.contactNumber = contactNumber;
        }
        public void displayInformation () {
            System.out.println("Head of Department: " + getHodName());
            System.out.println("Department: " + getDepartmentName());
            System.out.println("Office Number: " + getOfficeNumber());
            System.out.println("Contact Number: " + getContactNumber());
        }


    }
