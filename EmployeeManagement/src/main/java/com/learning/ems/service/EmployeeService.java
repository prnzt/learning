package com.learning.ems.service;

import java.util.List;

import com.learning.ems.domain.Employee;

public interface EmployeeService {

	public List<Employee> getAllEmployeeDetails();
	public Employee getEmployeebyID(int id);
	public int saveEmployee(Employee employee);
	public int deleteEmployee(int id);
	public int updateEmployee(Employee employee);
	
}
