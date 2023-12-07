package com.training.turkcell.spring.lab1;

import org.springframework.stereotype.Component;

@Component
public class EmployeeInfoPrinter {

    public void print(Employee employeeParam) {
        System.out.println("Employee Info : " + employeeParam);
    }

}
