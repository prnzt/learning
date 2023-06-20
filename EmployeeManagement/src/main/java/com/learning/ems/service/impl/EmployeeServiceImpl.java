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

    public Employee getEmployeebyID(int id){
        return employeeDao.getEmployeebyId(id);
    }


	@Override
	public int saveEmployee(Employee employee) {
		return employeeDao.saveEmployee(employee);
	}
	
	@Override
	public int deleteEmployee(int id) {
		return employeeDao.deleteEmployee(id);
	}
	
	@Override
	public int updateEmployee(Employee employee) {
		return employeeDao.updateEmployee(employee);
	}
	
   
}
