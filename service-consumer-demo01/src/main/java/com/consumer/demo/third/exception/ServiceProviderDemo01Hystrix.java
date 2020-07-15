package com.consumer.demo.third.exception;

import com.consumer.demo.third.api.ServiceProviderDemo01Client;
import org.springframework.stereotype.Component;

/**
 * @author Steven Shi
 * @date 2020/7/11 9:45
 */
@Component
public class ServiceProviderDemo01Hystrix implements ServiceProviderDemo01Client {
    @Override
    public String sayHello(String userName) {
        return "Sorry! The SERVICE-PROVIDER-DEMO01 is unavailable.";
    }
}
