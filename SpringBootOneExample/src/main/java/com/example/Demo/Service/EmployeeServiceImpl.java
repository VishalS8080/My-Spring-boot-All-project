package com.example.Demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Demo.Dao.EmployeeDao;
import com.example.Demo.Entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeDao employeeDao;
	@Override
	public void saveEmployeeData(Employee employee) {
		// TODO Auto-generated method stub
		System.out.println("Employee in Service :"+ employee);
		employeeDao.saveEmployeeData(employee);
	}

}
