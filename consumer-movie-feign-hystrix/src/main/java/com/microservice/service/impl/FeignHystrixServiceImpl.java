package com.microservice.service.impl;

import com.microservice.entity.User;
import com.microservice.service.FeignHystrixService;
import com.sun.org.apache.bcel.internal.generic.NEW;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by bonismo@hotmail.com
 * 下午12:41 on 17/12/9.
 */
@Component
public class FeignHystrixServiceImpl implements FeignHystrixService {

    private static final Logger LOGGER = LoggerFactory.getLogger(FeignHystrixServiceImpl.class);

    @Override
    public User findById(Long id) {
        FeignHystrixServiceImpl.LOGGER.info("异常发生，进入 fallBack 放，接收参数异常");
        User user = new User();
        user.setId(-1L);
        user.setUsername("default name");
        user.setAge(0);
        return user;
    }
}
