package com.training.turkcell.spring.lab1;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;


@RequiredArgsConstructor
public class CardPrinter implements IPrinter {
    private final String prefix;


    public String print(Employee employeeParam) {
        return  prefix + " " + employeeParam.getName() + " " + employeeParam.getSurname();
    }

}
