package com.training.turkcell.spring.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component("thirdBean")
public class MyThirdSpringBean {
    private MySecondSpringBean mySecondSpringBean;

    // Constructor Injection
    @Autowired
    public MyThirdSpringBean(final MySecondSpringBean mySecondSpringBeanParam) {
        mySecondSpringBean = mySecondSpringBeanParam;
    }

    public MyThirdSpringBean(String str) {
    }

    public void doThis(){
        System.out.println("DoThis");
    }


}
