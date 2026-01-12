package com.example.springCRUD.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springCRUD.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{
	///save(), findAll(), findById(),delete()
	

}
