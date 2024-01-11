package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	
	@Autowired
	private JavaMailSender javaMailSender;
	
	@RequestMapping(value = "/send" )
	public String mailSending() {
		
		SimpleMailMessage message = new SimpleMailMessage();
		message.setTo("vishalkamble550@gmail.com");
		message.setText("Hi, this is test mail.");
		message.setSubject("This is Testing purpose mail.");
		
		javaMailSender.send(message);
		
		return "Mail Sent.";
		
	}


}
