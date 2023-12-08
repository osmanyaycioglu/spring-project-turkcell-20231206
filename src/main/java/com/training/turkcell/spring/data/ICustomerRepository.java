package com.training.turkcell.spring.data;

import com.training.turkcell.spring.rest.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ICustomerRepository extends JpaRepository<Customer, Long> {

    List<Customer> findByName(String name);

    List<Customer> findBySurname(String surname);

    List<Customer> findByNameLike(String name);

    List<Customer> findByNameAndSurname(String name,
                                        String surname);

    List<Customer> findBySurnameAndHeightGreaterThanOrderBySurname(String surname,
                                                                   Integer integerParam);

    List<Customer> findByHeightGreaterThan(Integer height);

    List<Customer> findByHeightBetween(Integer min,
                                       Integer max);

    @Query("select c from Customer c where c.name=?1")
    List<Customer> searchName(String name);

    @Query(value = "select * from customer_storage c where c.customer_name=?1", nativeQuery = true)
    List<Customer> searchNameNative(String name);

}
