package com.learning.ems.service;

import java.util.List;

import com.learning.ems.domain.Employee;

public interface EmployeeService {

	public List<Employee> getAllEmployeeDetails();
	
	public Employee getEmployeeDetailsById(int id);

	public int deleteEmployeeById(int id);
	
	public int addEmployee(Employee employee);

	public int updateEmployee(Employee employee);


	
}
