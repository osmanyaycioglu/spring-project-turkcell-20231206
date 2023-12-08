package com.training.turkcell.spring.rest;

import com.training.turkcell.spring.configuration.ApplicationProps;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/app/configuration")
@RequiredArgsConstructor
public class AppConfigController {
    private final ApplicationProps applicationProps;

    @GetMapping("/show")
    public ApplicationProps showProps(){
        return applicationProps;
    }

}
