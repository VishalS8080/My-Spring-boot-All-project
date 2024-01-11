package com.example.service;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Dao.HomeDao;
import com.example.SpringBoot.entity.Student;
@Service
public class HomeServiceImpl implements HomeService {
    @Autowired
    private HomeDao homeDao;
	@Override
	public void saveStudentData(Student student) {
		// TODO Auto-generated method stub
		System.out.println("In service Layer:+ student");
		homeDao.saveStudentData(student);
	}
	@Override
	public List<Student> getloginData(String uname, String pass) {
		// TODO Auto-generated method stub
	 
		
		return homeDao.getloginData(uname, pass);
	}

}
