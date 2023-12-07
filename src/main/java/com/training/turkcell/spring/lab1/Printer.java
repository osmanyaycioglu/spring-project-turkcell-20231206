package com.training.turkcell.spring.lab1;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class Printer {
    private final CardPrinter cardPrinter;
    private final EmployeeInfoPrinter employeeInfoPrinter;

    public void print(Employee employeeParam){
        cardPrinter.print(employeeParam);
        employeeInfoPrinter.print(employeeParam);
    }

}
