package com.training.turkcell.spring.lab1;

import org.springframework.stereotype.Component;

@Component
public class CardPrinter {

    public void print(Employee employeeParam) {
        System.out.println("Sayın : " + employeeParam.getName() + " " + employeeParam.getSurname());
    }

}
