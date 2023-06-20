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
	public Employee getEmployeebyID(@PathVariable("id") int id)
	{
		return employeeService.getEmployeebyID(id);
	}
	
	@PostMapping("/employees/addEmployee")
	public int saveEmployee(@RequestBody Employee employee) {
		return employeeService.saveEmployee(employee);
		
	}
	
	@DeleteMapping("/employees/{id}")
	public int deleteEmployee(@PathVariable("id") int id) {
		return employeeService.deleteEmployee(id);
	}
	
	@PutMapping("/employee")
	public int updtaeEmployee(@RequestBody Employee employee) {
		return employeeService.updateEmployee(employee);
	}
	

}
