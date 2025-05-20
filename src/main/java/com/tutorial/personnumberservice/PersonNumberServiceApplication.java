package com.tutorial.personnumberservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PersonNumberServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(PersonNumberServiceApplication.class, args);
	}

}
