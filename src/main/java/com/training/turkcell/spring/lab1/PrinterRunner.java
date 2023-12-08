package com.training.turkcell.spring.lab1;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PrinterRunner implements CommandLineRunner {
    private final Printer printer;

    @Override
    public void run(final String... args) throws Exception {

        System.out.println("***********************************");
        System.out.println(printer.print(Employee.builder()
                                                 .withName("osman")
                                                 .withSurname("yaycıoğlu")
                                                 .withEmployeeId("100055")
                                                 .withGender(EGender.MALE)
                                                 .build()));
        System.out.println("***********************************");
    }
}
