package com.test.registrationapp.model;

public class User {
    private String name;
    private String email;
    private String phone;
    private String gender;
    private String address;

    public User(String name, String email, String phone, String gender, String address) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.gender = gender;
        this.address = address;
    }

    // Getters (optional, useful later)
    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }
    public String getGender() { return gender; }
    public String getAddress() { return address; }
    
    @Override
public String toString() {
    return "User{name=" + name + ", email=" + email + ", phone=" + phone + ", gender=" + gender + ", address=" + address + "}";
}

}
