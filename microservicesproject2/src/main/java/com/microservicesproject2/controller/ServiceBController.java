package com.microservicesproject2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservicesproject2.client.ServiceAClient;

@RestController
public class ServiceBController {
	
	private final ServiceAClient serviceAClient;

	public ServiceBController(ServiceAClient serviceAClient) {
		super();
		this.serviceAClient = serviceAClient;
	}
	
	@GetMapping("/api/forward-message")
    public String forwardMessage() {
        return "Service B received: " + serviceAClient.getMessage();
    }
}
