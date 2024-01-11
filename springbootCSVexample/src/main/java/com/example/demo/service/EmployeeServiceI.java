package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
@Service
public class EmployeeServiceI implements EmployeeService {

	@Override
	public List<Employee> getAllEmployee() {
		Employee employee= new Employee();
		employee.setId(1);
		employee.setName("vishal");
		employee.setAddress("pune");
		employee.setCname("wipro");
		
		Employee employee1= new Employee();
		employee1.setId(2);
		employee1.setName("amar");
		employee1.setAddress("mumbai");
		employee1.setCname("TATA");
		
		Employee employee2= new Employee();
		employee2.setId(3);
		employee2.setName("amit");
		employee2.setAddress("Thane");
		employee2.setCname("info");
		
		
		Employee employee3= new Employee();
		employee3.setId(4);
		employee3.setName("akshay");
		employee3.setAddress("nashik");
		employee3.setCname("capgemini");
		
		List<Employee> list = new ArrayList<Employee>();
		list.add(employee);
		list.add(employee1);
		list.add(employee2);
		list.add(employee3);
		
		return list;
	}

}
