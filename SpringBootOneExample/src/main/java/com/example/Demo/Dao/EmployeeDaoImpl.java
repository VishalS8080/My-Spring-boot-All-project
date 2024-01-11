package com.example.Demo.Dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.Demo.Entity.Employee;



@Repository
public class EmployeeDaoImpl implements EmployeeDao {
    
	@Autowired
	private SessionFactory sf;
	@Override
	public void saveEmployeeData(Employee employee) {
		// TODO Auto-generated method stub
		System.out.println("Employee in Dao:"+ employee);
//	   Session session = sf.openSession();
//		Session.save(employee);
//		session.beginTransaction().commit();
//	
	}
   
}
