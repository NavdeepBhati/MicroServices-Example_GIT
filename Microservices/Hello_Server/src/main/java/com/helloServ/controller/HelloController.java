package com.helloServ.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/getWorld")
	public String  getWorld() {
		
		return "world Microservices";
		
	}
	
}
