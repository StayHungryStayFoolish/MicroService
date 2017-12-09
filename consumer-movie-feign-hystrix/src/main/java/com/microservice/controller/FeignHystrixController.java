package com.microservice.controller;

import com.microservice.entity.User;
import com.microservice.service.FeignHystrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by bonismo@hotmail.com
 * 下午12:36 on 17/12/9.
 */
@RestController
public class FeignHystrixController {

    @Autowired
    private FeignHystrixService feignHystrixService;

    @GetMapping("feign/{id}")
    public User findById(@PathVariable Long id) {
        User user = feignHystrixService.findById(id);
        return user;
    }
}
