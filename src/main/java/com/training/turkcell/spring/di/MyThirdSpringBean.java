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
        System.out.println("Init");
    }

    public MyThirdSpringBean(String str) {
    }

    public void doThis(){
        mySecondSpringBean.doOther();
        System.out.println("DoThis");
    }


}
