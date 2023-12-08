package com.training.turkcell.spring.customer.services;

import com.training.turkcell.spring.data.CustomerDataService;
import com.training.turkcell.spring.rest.models.Customer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerQueryService {
    private final CustomerDataService customerDataService;

    public List<Customer> findCustomerBySurname(String surname) {
        return customerDataService.findCustomerBySurname(surname);
    }

}
