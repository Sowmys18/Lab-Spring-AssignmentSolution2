package com.great.studentManagement.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.great.studentManagement.entity.Student;


public interface StudentService {
	 List<Student> findAll();

	

	public void save(Student thestudent);

	 void deleteById(int theId);

	Student getStudentById(long id);



	Student findById(int theId);

	

}
