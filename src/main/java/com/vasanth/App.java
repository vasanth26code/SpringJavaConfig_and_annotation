package com.vasanth;

import com.vasanth.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Student obj = context.getBean(Student.class);
        System.out.println(obj.getAge());
        obj.code();

//        Desktop dt = context.getBean("desktop",Desktop.class);
//        dt.compile();
//
//        Desktop dt1 = context.getBean("desktop",Desktop.class);
//        dt1.compile();

    }
}
