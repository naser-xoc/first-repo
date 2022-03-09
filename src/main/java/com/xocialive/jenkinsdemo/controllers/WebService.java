package com.xocialive.jenkinsdemo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebService {

	@GetMapping("/hello")
	public String sayHello() {
		return "hello";
	}
	
	@GetMapping("/sayName")
	public String sayName() {
		return "hello from xoc";
	}

}
