package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceOneController {
	
	@GetMapping(value="/")
	public String getStringData() {
		System.out.println(" In Service Controller");
		
		return"Service one called..";
	}

}
