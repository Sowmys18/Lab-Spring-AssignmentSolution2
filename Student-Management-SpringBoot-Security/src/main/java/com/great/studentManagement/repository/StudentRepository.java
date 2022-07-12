package com.great.studentManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.great.studentManagement.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
