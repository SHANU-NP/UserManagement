package com.example.springCRUD.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springCRUD.model.Student;
import com.example.springCRUD.service.StudentService;

@RestController
@RequestMapping("/stud")
public class StudentController {
	@Autowired
	StudentService service;

	@PostMapping
	public Student addStudent(@RequestBody Student s) {
		return service.saveStudent(s);

	}

	@GetMapping
	public List<Student> getStudents() {
		return service.getAllStudents();
	}

	@GetMapping("/{id}")
	public Student fetchStudentById(@PathVariable int id) {
		return service.getStudentById(id);

	}
	@DeleteMapping("/{id}")
	public String deleteStudent(@PathVariable int id) {
		 service.deleteStudent(id);
		 return " deleted successfully";
	}
	@PutMapping("{id}")
	public Student updateStudent(@PathVariable int id, @RequestBody Student s) {
		s.setId(id);
		return service.saveStudent(s);
		
	}
	
	
	

}
