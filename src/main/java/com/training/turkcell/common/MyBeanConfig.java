package com.training.turkcell.common;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class MyBeanConfig {

    @Bean
    @Lazy
    public Bean1 bean1(){
        return new Bean1();
    }

    @Bean
    public Bean2 bean2(){
        return new Bean2();
    }

}
