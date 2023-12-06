package com.training.turkcell.spring.di;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

// @Component
@RequiredArgsConstructor
public class MyCommandLineRunner implements CommandLineRunner {
    private final MyFifthSpringBean fifthSpringBean;

    @Override
    public void run(final String... args) throws Exception {
        fifthSpringBean.doThat();
    }
}
