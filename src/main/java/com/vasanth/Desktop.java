package com.vasanth;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
//@Component("com1") //----------- for using 2 obj of type com but choosing desktop using qualifier
@Primary  //----------- for using 2 obj of type com but choosing desktop using primary
@Scope("protype") //----- using while not using desktop anywhere so it will create a bean only when we want
public class Desktop implements Computer{

    public Desktop()
    {
        System.out.println("Desktop Object Created");
    }

    @Override
    public void compile()
    {
        System.out.println("Compiling using Desktop");
    }

}
