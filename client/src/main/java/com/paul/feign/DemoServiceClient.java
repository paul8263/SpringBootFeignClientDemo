package com.paul.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by paulzhang on 15/04/2017.
 */
@FeignClient("MyService")
public interface DemoServiceClient {
    @GetMapping("service")
    String demoService();
}
