package com.training.turkcell.spring.di.greetings;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;

@Profile("live")
@Configuration
public class LiveGreetingsConfig {


    @Bean("dynamicGreetings")
    public IGreetings dynamicGrBeanA(@Value("${app.greetings.language}") String language,
                                     Environment environment) {
        switch (language) {
            case "eng":
                return new EnglishGreetings();
            case "tr":
                return new TurkishGreetings();
            default:
                return new DynamicGreetings(environment.getProperty("app.greetings.hello-prefix"),
                                            environment.getProperty("app.greetings.goodbye-prefix"));
        }
    }

}

