package com.ksbhat.microservices.limitsservice.controller;

import com.ksbhat.microservices.limitsservice.bean.Limits;
import com.ksbhat.microservices.limitsservice.configuration.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

    @Autowired
    private Configuration configuration;
    @GetMapping(value = "/limits", produces = MediaType.A)
    public Limits retrieveLimits() {
        return new Limits(configuration.getMinimum(), configuration.getMaximum());
    }
}
