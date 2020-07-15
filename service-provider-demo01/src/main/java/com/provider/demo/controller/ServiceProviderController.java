package com.provider.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Steven Shi
 * @date 2020/7/11 8:27
 */
@RestController
@RequestMapping("/service-provider")
public class ServiceProviderController {
    @Value("${server.port}")
    private String port;

    @GetMapping("/say-hello")
    public String sayHello(@RequestParam("userName") String userName) {

        return "Hi!" + userName + ", I'm from port: " + this.port;
    }
}
