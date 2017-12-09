package com.microservice.service;

import com.microservice.entity.User;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by bonismo@hotmail.com
 * 上午11:37 on 17/12/9.
 */
@Service
public class RibbonHystrixService {

    @Autowired
    private RestTemplate restTemplate;

    private static final Logger LOGGER = LoggerFactory.getLogger(RibbonHystrixService.class);

    @HystrixCommand(fallbackMethod = "fallBack")
    public User findById(Long id) {
        return restTemplate.getForObject("http://provider-user/" + id, User.class);
    }

    public User fallBack(Long id) {
        RibbonHystrixService.LOGGER.info("异常发生，进入 fallBack 方法，接收参数：id = {}",id);
        User user = new User();
        user.setId(-1L);
        user.setUsername("default name");
        user.setAge(0);
        return user;
    }
}

