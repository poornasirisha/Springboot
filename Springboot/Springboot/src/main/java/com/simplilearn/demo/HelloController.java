package com.simplilearn.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/testme")
	public String hello() {
		return "Hello! Welcome to SpringBoot";
	}
	
	@GetMapping("/hello")
	public String welcome() {
		return "Welcome to API Endpoint Using SpringBoot";
	}
	
	

}