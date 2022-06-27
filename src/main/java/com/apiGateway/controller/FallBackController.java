package com.apiGateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackController {

	@GetMapping("/serviceFallBack")
	public String fallBackMethod() {
		return "Service is taking longer than Expected...................." + " \n"
				+ "Please try again later.......................";
	}
	
}
