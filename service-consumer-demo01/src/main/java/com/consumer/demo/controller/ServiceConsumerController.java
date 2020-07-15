package com.consumer.demo.controller;

import com.consumer.demo.service.ServiceConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Steven Shi
 * @date 2020/7/11 9:24
 */
@RestController
@RequestMapping("/service-consumer")
public class ServiceConsumerController {
    @Autowired
    private ServiceConsumerService serviceConsumerService;

    @GetMapping("/hello")
    public String hello(String userName) {
        return serviceConsumerService.sayHello(userName);
    }
}
