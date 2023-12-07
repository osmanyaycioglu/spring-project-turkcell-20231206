package com.training.turkcell.spring.di.greetings;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("trTalk")
public class TurkishGreetings extends AbstractGreetings {

    public void method(){
    }

    @Override
    public String sayHello(final String name,
                           final String surname) {
        return "Selam " + name + " " + surname;
    }

    @Override
    public String sayGoodbye(final String name,
                             final String surname) {
        return "Güle güle " + name + " " + surname;
    }

}
