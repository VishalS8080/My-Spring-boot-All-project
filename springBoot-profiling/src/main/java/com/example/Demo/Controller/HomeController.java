package com.example.Demo.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@Value(value="${myapp}")
	private String app;
	@RequestMapping(value="/")
	public String getData() {
		return "Application started in"+ app;
	}
}
