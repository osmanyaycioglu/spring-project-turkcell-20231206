package com.training.turkcell.spring.di.greetings;

public abstract class AbstractGreetings implements IGreetings{
    protected String beanName;

    @Override
    public void setBeanName(final String beanNameParam) {
        beanName = beanNameParam;
    }

    @Override
    public String getBeanName() {
        return beanName;
    }
}
