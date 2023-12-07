package com.training.turkcell.spring.di.greetings;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class GreetingsCommandLineRunner implements CommandLineRunner {
    private final IGreetings greetings;

    public GreetingsCommandLineRunner(@Qualifier("dynamicGreetings") IGreetings greetings) {
        this.greetings = greetings;
    }

    @Override
    public void run(final String... args) throws Exception {
        System.out.println("-------------Greetings-------------------");
        System.out.println(greetings.sayHello("osman",
                                              "yaycıoğlu"));
        System.out.println(greetings.sayGoodbye("osman",
                                                "yaycıoğlu"));
        System.out.println(greetings.speak("osman","yaycıoğlu"));

    }
}
