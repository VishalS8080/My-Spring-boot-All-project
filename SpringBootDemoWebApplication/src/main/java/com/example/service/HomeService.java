package com.example.service;

import java.util.List;

import com.example.SpringBoot.entity.Student;

public interface HomeService {
	
	void saveStudentData(Student student);
	
   List<Student> getloginData(String uname,String pass);
}
