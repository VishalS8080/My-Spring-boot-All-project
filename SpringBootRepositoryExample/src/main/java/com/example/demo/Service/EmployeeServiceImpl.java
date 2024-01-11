package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repo.EmpRepository;

@Service
public class EmployeeServiceImpl implements EmpService {

	@Autowired
	private EmpRepository empRepository;
	@Override
	public void saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		System.out.println("In service Layer:"+ employee);
		empRepository.save(employee);
	}

}
