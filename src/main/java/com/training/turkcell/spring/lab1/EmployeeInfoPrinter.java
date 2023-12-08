package com.training.turkcell.spring.lab1;

import org.springframework.stereotype.Component;

public class EmployeeInfoPrinter implements IPrinter {

    @Override
    public String print(final Employee employeeParam) {
        return "Employee Info : " + employeeParam;
    }

}
