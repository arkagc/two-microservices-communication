package com.microservicesproject2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Microservicesproject2Application {

	public static void main(String[] args) {
		SpringApplication.run(Microservicesproject2Application.class, args);
	}

}
