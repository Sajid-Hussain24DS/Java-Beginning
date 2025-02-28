package com.test.Interface;

public class Test {
    public static void main(String[] args) {
    University u = new Student();
    u.attendance();
    u.show();
    u = new Teacher();
    u.attendance();
    Work w = new Teacher();
    w.work();
    }
}
