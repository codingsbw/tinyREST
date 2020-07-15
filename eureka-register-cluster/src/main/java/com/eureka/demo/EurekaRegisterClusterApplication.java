package com.eureka.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaRegisterClusterApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaRegisterClusterApplication.class, args);
    }

}
