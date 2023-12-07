package com.training.turkcell.spring.di.greetings;

public interface IGreetings {
    String sayHello(String name,
                    String surname);

    String sayGoodbye(String name,
                      String surname);

    default String speak(String name,
                         String surname) {
        return "Speaking : " + sayHello(name,
                                        surname);
    }

}
