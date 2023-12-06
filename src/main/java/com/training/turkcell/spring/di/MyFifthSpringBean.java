package com.training.turkcell.spring.di;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("fifthBean")
public class MyFifthSpringBean {
    private MyForthSpringBean myForthSpringBean;

    // method Injection
    @Autowired
    public void methodABC(MyForthSpringBean myForthSpringBeanParam){
        myForthSpringBean = myForthSpringBeanParam;
    }

    public void doThat(){
        System.out.println("DoThat");
    }

}
