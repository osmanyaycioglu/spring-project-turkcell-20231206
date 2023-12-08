package com.training.turkcell.spring.lab1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile("ext")
@Configuration
public class PrinterConfigExt {

    @Bean
    public IPrinter cardPrinter(@Value("${printer.card.prefix}") final String prefix) {
        return new CardPrinter(prefix);
    }

    @Bean
    public IPrinter employeeInfoPrinter() {
        return new EmployeeInfoPrinter();
    }

    @Bean
    public IPrinter infoPrinter() {
        return new InfoPrinter();
    }

}
