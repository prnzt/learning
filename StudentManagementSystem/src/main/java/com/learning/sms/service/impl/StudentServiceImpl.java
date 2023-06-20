package com.learning.sms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.sms.domain.Student;
import com.learning.sms.repository.StudentRepository;
import com.learning.sms.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	StudentRepository studentRepository;
	
	@Override
	public List<Student> getAllStudentsDetails() {
		return studentRepository.findAll();
	}

}
