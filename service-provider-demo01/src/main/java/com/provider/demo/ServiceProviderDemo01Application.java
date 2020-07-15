package com.provider.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ServiceProviderDemo01Application {

    public static void main(String[] args) {
        SpringApplication.run(ServiceProviderDemo01Application.class, args);
    }
}
