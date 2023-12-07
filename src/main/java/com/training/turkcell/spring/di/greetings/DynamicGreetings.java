package com.training.turkcell.spring.di.greetings;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
public class DynamicGreetings implements IGreetings {
    private final String helloPrefix;
    private final String goodbyePrefix;


    @Override
    public String sayHello(final String name,
                           final String surname) {
        return helloPrefix + " " + name + " " + surname;
    }

    @Override
    public String sayGoodbye(final String name,
                             final String surname) {
        return goodbyePrefix + " " + name + " " + surname;
    }


}
