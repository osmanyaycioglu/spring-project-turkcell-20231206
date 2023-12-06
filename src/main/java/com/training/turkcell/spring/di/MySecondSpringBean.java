package com.training.turkcell.spring.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("secondBean")
public class MySecondSpringBean {
    // field Injection
    @Autowired
    private MyFirstSpringBean myFirstSpringBean;

    public void doOther(){
        System.out.println("DoOther");
    }


}
