package com.vasanth.config;

import com.vasanth.Computer;
import com.vasanth.Desktop;
import com.vasanth.Laptop;
import com.vasanth.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.vasanth")
public class AppConfig {

    // code for getting and setting value
//    @Bean
//    public Student student()
//    {
//        Student obj = new Student();
//        obj.setAge(24);
//        return obj;
//    }

    //code for autowiring the code method dependent on the computer interface which has desktop object
    //public Student student(Computer com)
//    @Bean
//    public Student student(@Autowired Computer com)
//    {
//        Student obj = new Student();
//        obj.setAge(24);
//        obj.setCom(com);
//        return obj;
//    }

    //code for autowiring @Autowired is optional
    //code for autowiring when code is dependent on both desktop and laptop using qualifier

//      @Bean
//      //public Student student(@Autowired Computer com)
//      public Student student(@Qualifier("desktop") Computer com)
//      {
//          Student obj = new Student();
//          obj.setAge(24);
//          obj.setCom(com);
//          return obj;
//      }

    //code for autowiring when code is dependent on both desktop and laptop without qualifier use primary in desktopbean

//    @Bean
//    public Student student(Computer com)
//    {
//        Student obj = new Student();
//        obj.setAge(24);
//        obj.setCom(com);
//        return obj;
//    }


    //    @Bean(name = {"desktop1","com1"})
//    @Bean
//    @Scope("prototype")
//    public Desktop desktop()
//    {
//        return new Desktop();
//    }

//    @Bean
//    @Primary
//    public Desktop desktop()
//    {
//        return new Desktop();
//    }
//
//    @Bean
//    public Laptop laptop()
//    {
//        return new Laptop();
//    }

}
