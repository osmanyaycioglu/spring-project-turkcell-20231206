package com.training.turkcell.spring.di;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("forthBean")
@RequiredArgsConstructor
public class MyForthSpringBean {
    private final MyThirdSpringBean myThirdSpringBean;

    public void doThat(){
        myThirdSpringBean.doThis();
        System.out.println("DoThat");
    }

}
