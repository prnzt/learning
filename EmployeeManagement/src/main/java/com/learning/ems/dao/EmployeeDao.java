package com.learning.ems.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.learning.ems.domain.Employee;

@Repository
public class EmployeeDao {

	@Autowired
	JdbcTemplate stmt;
	public List<Employee> getAllEmployees()
	{
		return stmt.query("select * from employee", new BeanPropertyRowMapper<Employee>(Employee.class));
	}

	public Employee getEmployeebyId(int id) 
	{
		
		return stmt.queryForObject("select * from employee where employeeid=?",new Object[] {id}, new BeanPropertyRowMapper<Employee>(Employee.class));
	}
	
	public int saveEmployee(Employee employee)
	{
		
		return stmt.update("insert into employee (employeeid, employeename, employeedept, employeedoj, employeedob, employeerole, employeeaddress, employeesalary) values (?,?,?,?,?,?,?,?)",employee.getEmployeeId(),employee.getEmployeeName(),
				employee.getEmployeeDept(),employee.getEmployeeDOJ(),employee.getEmployeeDOB(),employee.getEmployeeRole(),employee.getEmployeeAddress(),employee.getEmployeeSalary());
	}
	
	public int deleteEmployee(int id)
	{
		return stmt.update("delete from employee where employeeid=?" ,id);
	}
	
	public int updateEmployee(Employee employee)
	{
		return stmt.update("update employee set employeesalary=? , employeedob=? where employeeid=?" , employee.getEmployeeSalary(),employee.getEmployeeDOB(),employee.getEmployeeId());
	}
	
}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      