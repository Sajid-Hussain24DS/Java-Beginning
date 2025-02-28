package com.test.Interface;

public class Teacher implements University , Work {
    @Override
    public void attendance() {
        System.out.println(University.name+" teacher must have maintain their 90% attendance   ");

        }

    @Override
    public void show() {

    }

    public void work(){
            System.out.println("Teacher should have to teach the students properly");

        }

    }

