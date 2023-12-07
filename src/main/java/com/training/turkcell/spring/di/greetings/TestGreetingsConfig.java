package com.training.turkcell.spring.di.greetings;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile("test")
@Configuration
public class TestGreetingsConfig {

    @Bean("dynamicGreetings")
    public IGreetings dynamicGrBeanA() {
        return new EnglishGreetings();
    }
}

