package com.training.turkcell.spring.di;

import org.springframework.stereotype.Component;

// Bean name = myFirstSpringBean
@Component
public class MyFirstSpringBean {
    // myFirstSpringBean -> Camel
    // MyFirstSpringBean -> Pascal
    // my-first-spring-bean -> Kebap
    // my_first_spring_bean -> Snake


    public MyFirstSpringBean() {
        System.out.println("MyFirstSpringBean yaratıldı");
    }

    public void doIt(){
        System.out.println("DoIt");
    }


}
