package com.learning.sms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.sms.domain.Student;
import com.learning.sms.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService studentService ;   
	
	@GetMapping(value = "/students")
	public List<Student> getAllStudentsDetails()
	{
	   return studentService.getAllStudentsDetails(); 
		 
	}
	

}
