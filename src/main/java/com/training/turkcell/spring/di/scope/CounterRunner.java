package com.training.turkcell.spring.di.scope;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CounterRunner implements CommandLineRunner {
    @Autowired
    private CountService countService1;
    @Autowired
    private CountService countService2;
    @Autowired
    private CountService countService3;

    @Override
    public void run(final String... args) throws Exception {
        System.out.println("1 : " + countService1.increamentGet());
        System.out.println("1 : " + countService1.increamentGet());
        System.out.println("2 : " + countService2.increamentGet());
        System.out.println("2 : " + countService2.increamentGet());
        System.out.println("3 : " + countService3.increamentGet());
        System.out.println("3 : " + countService3.increamentGet());
    }
}
