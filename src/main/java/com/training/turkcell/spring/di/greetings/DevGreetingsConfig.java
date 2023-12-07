package com.training.turkcell.spring.di.greetings;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile("dev")
@Configuration
public class DevGreetingsConfig {

    @Bean("dynamicGreetings")
    public IGreetings dynamicGrBeanA() {
        return new TurkishGreetings();
    }
}

