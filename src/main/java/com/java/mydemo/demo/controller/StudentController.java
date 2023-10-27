package com.java.mydemo.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@GetMapping("/welcome")
	String welcome() {
		
		return "Welcome to java and spring boot application !!!!! i am testing whether poll SCM in jenkins is working";
	}

}
