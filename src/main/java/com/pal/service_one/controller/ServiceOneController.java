package com.pal.service_one.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class ServiceOneController {

    @GetMapping("/service-one/health")
    public String serviceOneHealthCheck() {
        return "Service One is Up and Running";
    }
}
