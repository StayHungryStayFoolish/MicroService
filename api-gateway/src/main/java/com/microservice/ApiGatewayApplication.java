package com.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @EnableZuulProxy
 * 开启 Zuul 网关服务
 * 跟进该注解可以看到该注解整合了@EnableCircuitBreaker、@EnableDiscoveryClient，是个组合注解，目的是简化配置
 */
@EnableZuulProxy
@SpringBootApplication
public class ApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayApplication.class, args);
	}
}
