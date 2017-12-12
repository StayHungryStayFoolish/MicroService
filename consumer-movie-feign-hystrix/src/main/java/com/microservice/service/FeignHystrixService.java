package com.microservice.service;

import com.microservice.entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by bonismo@hotmail.com
 * 下午12:31 on 17/12/9.
 */
@FeignClient(name = "provider-user", fallback = FeignHystrixFallBack.class)
public interface FeignHystrixService {

    /*** @FeignClient 不支持 @GetMapping 缩写注解      ******************/
    @RequestMapping(value = "/{id}")
    User findById(@RequestParam("id") Long id);


}
