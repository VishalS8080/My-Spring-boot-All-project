package com.example.Demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Demo.entity.Student;
import com.example.Demo.repo.StudentReposatory;

@Service
public class HomeServiceImpl implements HomeService {
	@Autowired
	private StudentReposatory StudentReposatory;

	@Override
	public void saveStudent(Student student) {
		// TODO Auto-generated method stub
		System.out.println("In service layer:" + student);
		StudentReposatory.save(student);
	}

	@Override
	public Student getloginData(String uname, String pass) {
		// TODO Auto-generated method stub
		Student student = StudentReposatory.findByUnameAndPass(uname, pass);
		return student;
	}

	@Override
	public Student getDataUsingOnlyUname(String uname) {
		// TODO Auto-generated method stub
		return StudentReposatory.findByUname(uname);
	}

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		List<Student> list =(List<Student>) StudentReposatory.findAll();
		return list;
	}

	@Override
	public Student getStudentUsingid(int id) {
		// TODO Auto-generated method stub
		Student student = StudentReposatory.findById(id).get();
		return student;
	}

	@Override
	public void studentUpdating(Student student) {
		// TODO Auto-generated method stub
		StudentReposatory.save(student);
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		StudentReposatory.deleteById(id);
	}

}
