package com.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConsumerMovieRibbonHystrixApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerMovieRibbonHystrixApplication.class, args);
	}
}
