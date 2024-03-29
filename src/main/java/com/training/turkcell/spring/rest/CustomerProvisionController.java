package com.training.turkcell.spring.rest;

import com.training.turkcell.spring.customer.services.CustomerProvisionService;
import com.training.turkcell.spring.rest.models.Customer;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/customer/provision")
@RequiredArgsConstructor
public class CustomerProvisionController {
    private final CustomerProvisionService customerProvisionService;

    @PostMapping("/add")
    public String add(@Valid @RequestBody Customer customerParam) {
        return customerProvisionService.addNewCustomer(customerParam);
    }

}
