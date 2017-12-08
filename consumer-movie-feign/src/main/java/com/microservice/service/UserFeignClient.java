package com.microservice.service;

import com.microservice.entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by bonismo@hotmail.com
 * 下午3:38 on 17/12/8.
 */
@FeignClient(value = "provider-user")
public interface UserFeignClient {

    @RequestMapping("/{id}")
    User findByIdFeign(@RequestParam("id") Long id);
}
