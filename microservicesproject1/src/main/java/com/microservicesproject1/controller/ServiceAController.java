package com.microservicesproject1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/message")
public class ServiceAController {
	
	@GetMapping
	public String getMessage() {
		return "Hello from Service A";
	}
}
