package com.vasanth;

public class Student {

    private int age;
    private Computer com;

    public Student() {
        System.out.println("Student Object Created");
    }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public Computer getCom() {
        return com;
    }
    public void setCom(Computer com) {
        this.com = com;
    }

    public void code() {
        System.out.println("Coding");
        com.compile();
    }

}
