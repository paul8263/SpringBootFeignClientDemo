package com.service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by paulzhang on 15/04/2017.
 */
@RestController
public class DemoServiceController {
    @GetMapping("/service")
    public String demoService() {
        return "Sample Service";
    }
}
