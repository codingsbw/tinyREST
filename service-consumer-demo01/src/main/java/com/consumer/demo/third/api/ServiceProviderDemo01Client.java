package com.consumer.demo.third.api;

import com.consumer.demo.third.exception.ServiceProviderDemo01Hystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Steven Shi
 * @date 2020/7/11 9:41
 */
@FeignClient(value = "SERVICE-PROVIDER-DEMO01", fallback = ServiceProviderDemo01Hystrix.class)
public interface ServiceProviderDemo01Client {
    @GetMapping("/service-provider/say-hello")
    String sayHello(@RequestParam("userName") String userName);
}
