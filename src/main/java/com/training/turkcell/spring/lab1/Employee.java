package com.training.turkcell.spring.lab1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    private String name;
    private String surname;
    private String employeeId;
    private EGender gender;
}
