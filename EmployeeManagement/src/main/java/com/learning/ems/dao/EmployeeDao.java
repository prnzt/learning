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
	
}
