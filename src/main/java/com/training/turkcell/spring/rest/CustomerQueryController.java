package com.training.turkcell.spring.rest;

import com.training.turkcell.spring.customer.services.CustomerProvisionService;
import com.training.turkcell.spring.customer.services.CustomerQueryService;
import com.training.turkcell.spring.rest.models.Customer;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/customer/query")
@RequiredArgsConstructor
public class CustomerQueryController {
    private final CustomerQueryService customerQueryService;

    @PostMapping("/find/by/surname")
    public List<Customer> find(@RequestParam String surname) {
        return customerQueryService.findCustomerBySurname(surname);
    }

}
