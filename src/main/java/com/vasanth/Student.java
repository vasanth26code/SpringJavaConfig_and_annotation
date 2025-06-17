package com.vasanth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

    @Value("21")
    private int age;

    //@Autowired
//    @Qualifier("com1")
    private Computer com;

    //@Autowired      -------- using autowired here is constructor injection but constructor is parameterized and not
    //                         a default constructor like this
    public Student() {
        System.out.println("Student Object Created");
    }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public Computer getCom() {
        return com;
    }

    @Autowired    //-------- using autowired here is setter injection
    @Qualifier("laptop") //----- using qualifier and primary together qualifier is preffered ahead of primary
    public void setCom(Computer com) {
        this.com = com;
    }

    public void code() {
        System.out.println("Coding");
        com.compile();
    }

}
