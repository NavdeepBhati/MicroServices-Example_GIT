package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloTemp {

	@RequestMapping("/getTemp")
	public String name() {
		System.err.println("Callleddd");
		return "Heloo temp";
	}
}
