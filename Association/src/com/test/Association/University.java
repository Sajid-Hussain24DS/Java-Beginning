package com.test.Association;

public class University {
    private String name;
    private Department department;

    public String getName() {
    return name;
}

    public void setName(String name) {
    this.name = name;
}

    public Department getDepartment() {
    return department;
}

    public void setDepartment(Department department) {
    this.department = department;
}
}
