package com.consumer.demo.service.impl;

import com.consumer.demo.service.ServiceConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author Steven Shi
 * @date 2020/7/11 9:30
 */
@Service
public class ServiceConsumerServiceImpl implements ServiceConsumerService {
    @Autowired
    private RestTemplate restTemplate;

    @Override
    public String sayHello(String userName) {
        String url = "http://service-provider-demo01/service-provider/say-hello?userName=" + userName;
        return restTemplate.getForObject(url, String.class);
    }
}
