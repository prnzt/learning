package com.learning.ems.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.ems.dao.EmployeeDao;
import com.learning.ems.domain.Employee;
import com.learning.ems.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeDao employeeDao;
	Employee employee;
	
	@Override
	public List<Employee> getAllEmployeeDetails() {
		return employeeDao.getAllEmployees();
		
	}
	
	@Override
	public Employee getEmployeeDetailsById(int id) {
		return employeeDao.getEmployeeById(id);
		
	}

	@Override
	public int deleteEmployeeById(int id) 
	{
		return employeeDao.deleteEmployeeById(id);
	}
	
	public int addEmployee(Employee employee)
	{
		return employeeDao.addEmployee(employee);
		
	}
	
	public int updateEmployee(Employee employee)
	{
		return employeeDao.updateEmployee(employee);
	}

}
