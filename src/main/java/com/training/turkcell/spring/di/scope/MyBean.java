package com.training.turkcell.spring.di.scope;

import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
// @DependsOn({})
public class MyBean {
    private int[] buffer = new int[10_000];

    public void method(){
    }

}
