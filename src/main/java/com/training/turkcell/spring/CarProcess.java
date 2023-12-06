package com.training.turkcell.spring;


public class CarProcess {
    private Car car;

    public CarProcess(final Car carParam) {
        car = carParam;
    }

    public int forward(int timePeriod){
        int averageSpeedLoc = car.getAverageSpeed() / 60;
        return averageSpeedLoc * timePeriod;
    }

}
