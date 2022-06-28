package com.apiGateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackController {

	@GetMapping("/feignServiceFallBack")
	public String feignClientFallBackMethod() {
		return "Feign Client Service is taking longer than Expected...................." + " \n"
				+ "Please try again later.......................";
	}
	
	@GetMapping("/scaffoldServiceFallBack")
	public String scaffoldFallBackMethod() {
		return "Scaffold Service is taking longer than Expected...................." + " \n"
				+ "Please try again later.......................";
	}
	
}
