package com.training.turkcell.spring.di.greetings;

import com.training.turkcell.common.Bean1;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GreetingsCommandLineRunner implements CommandLineRunner {
    private final IGreetings       greetings;
    private final List<IGreetings> greetingsList;
    private final Bean1 bean1;

    public GreetingsCommandLineRunner(@Qualifier("dynamicGreetings") IGreetings greetings,
                                      final List<IGreetings> greetingsListParam,
                                      final Bean1 bean1Param) {
        this.greetings = greetings;
        greetingsList  = greetingsListParam;
        bean1          = bean1Param;
    }

    @Override
    public void run(final String... args) throws Exception {
        System.out.println("-------------Greetings-------------------");
        System.out.println(greetings.sayHello("osman",
                                              "yaycıoğlu"));
        System.out.println(greetings.sayGoodbye("osman",
                                                "yaycıoğlu"));
        System.out.println(greetings.speak("osman",
                                           "yaycıoğlu"));
        System.out.println("-------------Greetings List-------------------");
        for (int i = 0; i < greetingsList.size(); i++) {
            System.out.println("-------------" + i + "-" + greetingsList.get(i)
                                                                        .getBeanName() + "-------------------");
            System.out.println(greetingsList.get(i)
                                            .sayHello("osman",
                                                      "yaycıoğlu"));
            System.out.println(greetingsList.get(i)
                                            .sayGoodbye("osman",
                                                        "yaycıoğlu"));
        }
    }
}
