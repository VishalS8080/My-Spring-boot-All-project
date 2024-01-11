package com.example.demo;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.controller.FileDataController;

@SpringBootApplication
public class DemoExelApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(DemoExelApplication.class, args);
		

	}

}
