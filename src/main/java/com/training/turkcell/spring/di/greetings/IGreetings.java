package com.training.turkcell.spring.di.greetings;

import org.springframework.beans.factory.BeanNameAware;

public interface IGreetings extends BeanNameAware {
    String sayHello(String name,
                    String surname);

    String sayGoodbye(String name,
                      String surname);

    default String speak(String name,
                         String surname) {
        return "Speaking : " + sayHello(name,
                                        surname);
    }

    String getBeanName();

}
