package com.training.turkcell.spring.rest.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "customer_storage")
public class Customer {
    @Id
    @GeneratedValue
    @JsonIgnore
    private Long customerId;
    @NotEmpty
    @NotBlank
    @Size(min = 2, max = 15, message = "isim {min} ile {max} arasında olmalı")
    @Column(name = "customer_name")
    private String  name;
    @NotEmpty
    @NotBlank
    @Size(min = 3, max = 20)
    private String  surname;
    @Min(50)
    @Max(300)
    private Integer height;
    @Min(10)
    @Max(400)
    private Integer weight;
}
