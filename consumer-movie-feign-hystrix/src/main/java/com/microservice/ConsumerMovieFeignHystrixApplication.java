package com.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @EnableCircuitBreaker
 * 开启断路器
 * @EnableFeignClients
 * 开启 Feign 伪 HTTP 客户端
 */
@EnableCircuitBreaker
@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class ConsumerMovieFeignHystrixApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerMovieFeignHystrixApplication.class, args);
	}
}
