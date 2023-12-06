package com.training.turkcell.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringProjectApplication {

    public static void main(String[] args) {
//        SpringApplication.run(SpringProjectApplication.class,
//                              args);

        Car carLoc1 = new Car("320",
                              "BMW",
                              170,
                              120,
                              0,
                              0D);

        CarProcess carProcessLoc = new CarProcess(carLoc1);
        int        km            = carProcessLoc.forward(30);
        System.out.println("Forward : " + km);
    }

}
