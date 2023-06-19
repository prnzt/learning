package com.learning.ems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.learning.ems.domain.Employee;
import com.learning.ems.service.EmployeeService;


@RestController
public class EmployeeController {
	
    @Autowired
	EmployeeService employeeService ;
    Employee employee;

	@GetMapping("/employees")
	public List<Employee> getAllEmployees()
	{
			return employeeService.getAllEmployeeDetails();
	}
	
	
	@GetMapping("/employees/{id}")
	public Employee getEmployeeById(@PathVariable("id") int id)
	{
			return employeeService.getEmployeeDetailsById(id);
	}
	
	
	@DeleteMapping("/employees/{id}")
	public int deleteEmployeeById(@PathVariable("id") int id) 
	{
		return employeeService.deleteEmployeeById(id);
	}
	
	
	@PostMapping("/employees/addEmployee")
	public int addEmployee(@RequestBody Employee employee)
	{
		return employeeService.addEmployee(employee);
		
	}
	
	@PutMapping("/employee")
	public int updateEmployee(@RequestBody Employee employee)
	{
		return employeeService.updateEmployee(employee);
	
	}
}
