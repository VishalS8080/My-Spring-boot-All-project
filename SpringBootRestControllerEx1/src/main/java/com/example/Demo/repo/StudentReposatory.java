package com.example.Demo.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Demo.entity.Student;

@Repository
public interface StudentReposatory extends CrudRepository<Student, Integer> {

	Student findByUnameAndPass(String uname,String pass);
	
	Student findByUname(String uname);
}
