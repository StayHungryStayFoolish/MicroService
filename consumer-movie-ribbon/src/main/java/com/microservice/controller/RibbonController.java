package com.microservice.controller;

import com.microservice.entity.User;
import com.microservice.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by bonismo@hotmail.com
 * 下午2:45 on 17/12/8.
 */
@RestController
public class RibbonController {

    @Autowired
    private RibbonService ribbonService;

    @GetMapping(value = "ribbon/{id}")
    public User findById(@PathVariable Long id) {
        return ribbonService.findById(id);
    }
}
