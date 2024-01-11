package com.example.Demo.Service;

import java.util.List;

import com.example.Demo.entity.Student;

public interface HomeService {
	
	void saveStudent(Student student);
	
	Student getloginData(String uname, String pass);
	
	Student getDataUsingOnlyUname(String uname);
	
	List<Student>getAllStudent();
	
	Student getStudentUsingid(int id);
	
	void studentUpdating(Student student);
	
	void deleteById(int id);

}
