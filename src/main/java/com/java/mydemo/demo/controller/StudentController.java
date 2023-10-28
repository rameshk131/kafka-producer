package com.java.mydemo.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@GetMapping("/welcome")
	String welcome() {
		
		return "Welcome to java and spring boot application ! 3rd commit";
	}
	
	@GetMapping("/health")
	String health() {
		String 
		return "Spring boot app server is up and running......."
	}
}
