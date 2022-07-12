package com.great.studentManagement.service;

import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.great.studentManagement.entity.Student;
import com.great.studentManagement.repository.StudentRepository;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

@Repository
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentRepository;

	@Override
	public List<Student> findAll() {

		List<Student> students = studentRepository.findAll();

		return students;
	}

	@Override
	public Student getStudentById(long id) {
		Optional<Student> optional = studentRepository.findById((int) id);
		Student student = null;
		if (optional.isPresent()) {
			student = optional.get();
		} else {
			throw new RuntimeException(" Student not found for id :: " + id);
		}
		return student;
		
	}

	@Override
	public void save(Student theStudent) {

		studentRepository.save(theStudent);

	}

	@Override
	public void deleteById(int id) {

		studentRepository.deleteById(id);

	}

	
		@Override
		public Student findById(int theId) {
			// TODO Auto-generated method stub
			return studentRepository.findById(theId).get();
			
		}
	}

