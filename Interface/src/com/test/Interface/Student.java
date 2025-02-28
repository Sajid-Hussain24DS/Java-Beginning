package com.test.Interface;

public class Student implements University {
    @Override
    public void attendance() {
        System.out.println("Student must have 80% maintain their attendance ");

    }

    @Override
    public void show() {

    }
}
