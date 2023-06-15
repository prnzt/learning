package com.learning.ems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.ems.domain.Employee;
import com.learning.ems.service.EmployeeService;


@RestController
public class EmployeeController {
	
    @Autowired
	EmployeeService employeeService ;

	@GetMapping("/employees")
	public List<Employee> getAllEmployees()
	{
			return employeeService.getAllEmployeeDetails();
	}
	
}