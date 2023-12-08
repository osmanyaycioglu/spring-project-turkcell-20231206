package com.training.turkcell.spring.rest.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
    private String name;
    private String surname;
    private Integer height;
    private Integer weight;
}
