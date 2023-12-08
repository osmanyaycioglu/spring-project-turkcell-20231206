package com.training.turkcell.spring.lab1;

public class InfoPrinter implements IPrinter {

    @Override
    public String print(final Employee employeeParam) {
        return "Info : empID : " + employeeParam.getEmployeeId();
    }

}
