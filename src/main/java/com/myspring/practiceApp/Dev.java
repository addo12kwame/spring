package com.myspring.practiceApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


// add component for the class to be registered as a bean
@Component
public class Dev {

    //@Autowired // Field injection
    @Autowired
    @Qualifier("desktop")
    private Computer computer;


    /*
     * This is a constructor injection and you don't need any annotation here
     * Constructor injection does not need autowired
     * Constructor is default and optional
     */
//    public Dev(Laptop laptop){
//        this.laptop = laptop;
//    }

    /*
     * This is the setter injection
     * Setters needs the autowired annotation
     * Field and setter injections need the autowired annotation
     */
//    @Autowired
//    public void setLaptop(Laptop laptop){
//        this.laptop = laptop;
//    }


    public void build(){

        computer.compile();

        System.out.println("Working on project");
    }
}
