package com.training.turkcell.spring;


import lombok.*;

@Getter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class Car {
    private String model;
    private String brand;
    private int horsePower;
    private int averageSpeed;
    private int currentSpeed;
    private double gps;
}

