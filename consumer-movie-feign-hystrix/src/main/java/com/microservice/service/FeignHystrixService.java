package com.microservice.service;

import com.microservice.entity.User;
import com.microservice.service.impl.FeignHystrixServiceImpl;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by bonismo@hotmail.com
 * 下午12:31 on 17/12/9.
 */
@FeignClient(name = "provider-user",fallback = FeignHystrixServiceImpl.class)
public interface FeignHystrixService {

    @RequestMapping(value = "/{id}")
    User findById(@RequestParam("id") Long id);
}
