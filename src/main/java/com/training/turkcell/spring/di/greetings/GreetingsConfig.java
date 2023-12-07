package com.training.turkcell.spring.di.greetings;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class GreetingsConfig {

    @Bean
    public IGreetings greetingsBean() {
        return new EnglishGreetings();
    }

    @Bean
    public IGreetings anotherGreetingsBean() {
        return new EnglishGreetings();
    }

    @Bean
    public IGreetings dynamicGrBean(@Value("${app.greetings.hello-prefix}") String helloPrefix,
                                    @Value("${app.greetings.goodbye-prefix}") String goodbyePrefix) {
        return new DynamicGreetings(helloPrefix,
                                    goodbyePrefix);
    }


    @Bean
    public IGreetings dynamicGrBeanB(Environment environmentParam) {
        String language = environmentParam.getProperty("app.greetings.language");
        switch (language){
            case "eng":
                return new EnglishGreetings();
            case "tr":
            default:
                return new TurkishGreetings();
        }
    }

    @Qualifier("espTalk")
    @Bean("spanishGreetings")
    public IGreetings dynamicGr2Bean() {
        DynamicGreetings dynamicGreetingsLoc = new DynamicGreetings("Ola",
                                                                    "Adios");
        System.out.println("Do whatever you want to do");
        return dynamicGreetingsLoc;
    }

}
