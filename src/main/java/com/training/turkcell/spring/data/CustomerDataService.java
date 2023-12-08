package com.training.turkcell.spring.data;

import com.training.turkcell.spring.rest.models.Customer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerDataService {
    private final ICustomerRepository customerRepository;

    public void insertCustomer(Customer customerParam){
        customerRepository.save(customerParam);
    }

    public List<Customer> findCustomerBySurname(String surname){
        return customerRepository.findBySurname(surname);
    }
}
