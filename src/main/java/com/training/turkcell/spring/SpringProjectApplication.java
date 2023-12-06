package com.training.turkcell.spring;

import com.training.turkcell.spring.di.MyFirstSpringBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.reflect.Constructor;

@SpringBootApplication
public class SpringProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringProjectApplication.class,
                              args);

        Car carLoc1 = new Car("320",
                              "BMW",
                              170,
                              120,
                              0,
                              0D);

        CarProcess carProcessLoc = new CarProcess(carLoc1);
        int        km            = carProcessLoc.forward(30);
        System.out.println("Forward : " + km);

        MyFirstSpringBean beanLoc1 = new MyFirstSpringBean();
        Class<MyFirstSpringBean> myFirstSpringBeanClassLoc = MyFirstSpringBean.class;
        try {
            Constructor<MyFirstSpringBean> constructorLoc = myFirstSpringBeanClassLoc.getConstructor();
            MyFirstSpringBean              myFirstSpringBeanLoc = constructorLoc.newInstance();
        } catch (Exception eParam) {
            throw new RuntimeException(eParam);
        }

        MyFirstSpringBean beanLoc2 = new MyFirstSpringBean();

    }

}
