package com.training.turkcell.spring.lab1;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class Printer {
    private final List<IPrinter> printers;

    public String print(Employee employeeParam) {
        StringBuilder builderLoc = new StringBuilder(100);
        for (IPrinter printerLoc : printers) {
            builderLoc.append(printerLoc.print(employeeParam))
                      .append("\n");
        }
        return builderLoc.toString();
    }

}
