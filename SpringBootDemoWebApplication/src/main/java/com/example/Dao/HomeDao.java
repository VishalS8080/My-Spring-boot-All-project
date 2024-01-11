package com.example.Dao;

import java.util.List;

import com.example.SpringBoot.entity.Student;

public interface HomeDao {
	
	void saveStudentData(Student student);
    
	List<Student> getloginData(String uname, String pass);
}
