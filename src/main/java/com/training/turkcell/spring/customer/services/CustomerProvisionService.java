package com.training.turkcell.spring.customer.services;

import com.training.turkcell.spring.data.CustomerDataService;
import com.training.turkcell.spring.rest.models.Customer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerProvisionService {
    private final CustomerDataService customerDataService;

    public String addNewCustomer(Customer customerParam) {
        customerDataService.insertCustomer(customerParam);
        return "Customer :  " + customerParam.getCustomerId() + " successfully created.";
    }

}
