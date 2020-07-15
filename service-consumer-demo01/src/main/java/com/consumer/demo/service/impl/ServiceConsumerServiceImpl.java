package com.consumer.demo.service.impl;

import com.consumer.demo.service.ServiceConsumerService;
import com.consumer.demo.third.api.ServiceProviderDemo01Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Steven Shi
 * @date 2020/7/11 9:30
 */
@Service
public class ServiceConsumerServiceImpl implements ServiceConsumerService {
    @Autowired
    private ServiceProviderDemo01Client serviceProviderDemo01Client;

    @Override
    public String sayHello(String userName) {
        return serviceProviderDemo01Client.sayHello(userName);
    }
}
