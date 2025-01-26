package com.test.Encapsulation;

public class UniversityDetail {
    private String uniName ;
    private String EstablishedYear;
    private String studentName;
    private String department;
    private String IdCard;

    public String getUniName() {
        return uniName;
    }

    public void setUniName(String uniName) {
        this.uniName = uniName;
    }

    public String getEstablishedYear() {
        return EstablishedYear;
    }

    public void setEstablishedYear(String establishedYear) {
        EstablishedYear = establishedYear;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getIdCard() {
        return IdCard;
    }

    public void setIdCard(String idCard) {
        IdCard = idCard;
    }
}
