package com.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * @EnbaleTurbine
 * 开启 Turbine 集群监控服务
 */
//@EnableHystrixDashboard
@EnableTurbine
@SpringBootApplication
public class HystrixTurbineApplication {

	public static void main(String[] args) {
		SpringApplication.run(HystrixTurbineApplication.class, args);
	}
}
