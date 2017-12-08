package com.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @EnableDiscoveryClient 向服务中心注册
 * @EnableFeignClients 开启 Feign 功能
 */
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class ConsumerMovieFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerMovieFeignApplication.class, args);
    }
}
