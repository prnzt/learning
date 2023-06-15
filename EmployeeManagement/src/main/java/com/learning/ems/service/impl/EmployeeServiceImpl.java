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
	
	@Override
	public List<Employee> getAllEmployeeDetails() {
		return employeeDao.getAllEmployees();
		
	}

}