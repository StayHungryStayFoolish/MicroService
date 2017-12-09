package com.microservice.service;

import com.microservice.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by bonismo@hotmail.com
 * 下午1:11 on 17/12/9.
 */
@Component
public class FeignHystrixFallBack implements FeignHystrixService {

    private static final Logger LOGGER = LoggerFactory.getLogger(FeignHystrixFallBack.class);

    @Override
    public User findById(Long id) {
        System.out.println("------- 进入 Feign FallBack ---------");
        FeignHystrixFallBack.LOGGER.info("异常发生，进入 fallBack 放，接收参数异常");
        User user = new User();
        user.setId(-1L);
        user.setUsername("default name");
        user.setAge(0);
        return user;
    }
}
