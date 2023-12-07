package com.training.turkcell.spring.di.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class CountService {
    private int counter = 0;

    public int increamentGet(){
        return counter++;
    }

}
