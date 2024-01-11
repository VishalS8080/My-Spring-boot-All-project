package com.example.Demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.Demo.Entity.Employee;
import com.example.Demo.Service.EmployeeService;

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
	@RequestMapping(value="/")
	public String indexPage() {
		return "index";
	}
	
	@RequestMapping(value="/reg")
	public String getRegisterData(@ModelAttribute Employee employee) {
		System.out.println("Employee Data:"+employee);
		employeeService.saveEmployeeData(employee);
		return "index";
		
	}
}
