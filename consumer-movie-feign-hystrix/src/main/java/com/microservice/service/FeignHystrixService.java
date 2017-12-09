package com.microservice.service;

import com.microservice.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by bonismo@hotmail.com
 * 下午12:31 on 17/12/9.
 */
@FeignClient(name = "provider-user", fallback = FeignHystrixService.FeignHystrixFallBack.class)
public interface FeignHystrixService {

    @RequestMapping(value = "/{id}")
    User findById(@RequestParam("id") Long id);

    @Component
    static class FeignHystrixFallBack implements FeignHystrixService {

        private static final Logger LOGGER = LoggerFactory.getLogger(FeignHystrixFallBack.class);

        @Override
        public User findById(Long id) {
            FeignHystrixFallBack.LOGGER.info("异常发生，进入 fallBack 放，接收参数异常");
            User user = new User();
            user.setId(-1L);
            user.setUsername("default name");
            user.setAge(0);
            return user;
        }
    }
}
