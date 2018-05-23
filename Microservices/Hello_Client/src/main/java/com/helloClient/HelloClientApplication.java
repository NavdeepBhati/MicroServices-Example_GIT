package com.helloClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@EnableEurekaClient
@SpringBootApplication
@ComponentScan(basePackages= {"com.controller","com.config"})
public class HelloClientApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(HelloClientApplication.class, args);
	}
}
