package com.microservice.service;

import com.microservice.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by bonismo@hotmail.com
 * 下午2:40 on 17/12/8.
 */
@Service
public class RibbonService {

    @Autowired
    private RestTemplate restTemplate;

    public User findById(Long id) {
        // http://服务提供者的 serviceId/url
        return this.restTemplate.getForObject("http://provider-user/" + id, User.class);
    }
}
