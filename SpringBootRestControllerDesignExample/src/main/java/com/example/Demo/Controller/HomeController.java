package com.example.Demo.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Demo.Model.Student;

@RestController
public class HomeController {
	
    @RequestMapping(value="/getStu")
	public Student showStudentData() {
		Student student = new Student();
		student.setId(1234);
		student.setName("vishal");
		student.setAddress("pune");
		
		return student;
	}
    
    @RequestMapping(value="/getStuAll")
	public List<Student> showAllStudentData() {
    List<Student> list = new ArrayList<Student>();
		Student student = new Student();
		student.setId(1234);
		student.setName("vishal");
		student.setAddress("pune");
		
		Student student1 = new Student();
		student1.setId(1234);
		student1.setName("Amit");
		student1.setAddress("pune");
		
		
		Student student2 = new Student();
		student2.setId(1234);
		student2.setName("Akshay");
		student2.setAddress("pune");
		
		
		Student student3 = new Student();
		student3.setId(1234);
		student3.setName("Amar");
		student3.setAddress("pune");
		
		list.add(student);list.add(student1);list.add(student2);list.add(student3);
		return list;
	}
}
