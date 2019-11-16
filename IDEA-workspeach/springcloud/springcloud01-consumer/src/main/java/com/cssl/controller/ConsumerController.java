package com.cssl.controller;

import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@Controller
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/bye")
    public String bye(){
        System.out.println("hello world111111111");
        return restTemplate.getForObject("http://SPRINGCLOUD01-PROVIDER/hi", String.class);
    }
}
