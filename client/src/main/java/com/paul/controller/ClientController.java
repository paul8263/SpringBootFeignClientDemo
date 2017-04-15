package com.paul.controller;

import com.paul.feign.DemoServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by paulzhang on 15/04/2017.
 */
@RestController
public class ClientController {

    @Autowired
    private DemoServiceClient demoServiceClient;

    @GetMapping("/get")
    public String getService() {
        return demoServiceClient.demoService();
    }
}
