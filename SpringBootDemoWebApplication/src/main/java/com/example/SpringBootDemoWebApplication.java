package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootDemoWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoWebApplication.class, args);
		System.out.println("web application start");
		
	}

}
