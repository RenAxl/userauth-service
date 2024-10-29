package com.redatha.userauth_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class UserauthServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserauthServiceApplication.class, args);
	}

}
