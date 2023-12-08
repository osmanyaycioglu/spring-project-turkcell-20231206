package com.training.turkcell.spring.configuration;

import com.training.turkcell.spring.rest.models.Customer;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Data
@Component
@ConfigurationProperties(prefix = "my.app")
public class ApplicationProps {
    private String                testStr;
    private String                connectionUrl;
    private Integer               connectionPort = 8080;
    private String                connectionUser;
    private String                connectionPassword;
    private Integer               checkPeriod;
    private Customer              defaultCustomer;
    private Department            mainDepartment;
    private List<String>          cities;
    private List<Department>      departments;
    private Map<String, Customer> admins;

}
