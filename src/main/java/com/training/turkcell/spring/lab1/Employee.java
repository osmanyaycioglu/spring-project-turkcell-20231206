package com.training.turkcell.spring.lab1;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(setterPrefix = "with")
public class Employee {
    private String name;
    private String surname;
    private String employeeId;
    private EGender gender;
}
