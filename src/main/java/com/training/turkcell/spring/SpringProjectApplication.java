package com.training.turkcell.spring;

import com.training.turkcell.spring.di.MyFifthSpringBean;
import com.training.turkcell.spring.di.MyFirstSpringBean;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.lang.reflect.Constructor;

@SpringBootApplication
@EnableScheduling
@RequiredArgsConstructor
public class SpringProjectApplication {
    private final MyFifthSpringBean fifthSpringBean;

    @Scheduled(fixedDelay = 10_000,initialDelay = 2_000)
    public void methodA(){
        fifthSpringBean.doThat();
    }


    public static void main(String[] args) {
        ConfigurableApplicationContext contextLoc = SpringApplication.run(SpringProjectApplication.class,
                                                                          args);
//        MyFifthSpringBean beanLoc = contextLoc.getBean(MyFifthSpringBean.class);
//        beanLoc.doThat();

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
