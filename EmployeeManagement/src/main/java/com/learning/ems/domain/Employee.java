package com.learning.ems.domain;

import java.sql.Date;


public class Employee {
	
	private int id ;
	private int employeeId ;
	private String employeeName;
	private String employeeDept;
	private Date employeeDOJ ;
	private Date employeeDOB ;
	private String employeeRole ;
	private String employeeAddress;
	private long employeeSalary ;

	
	public Employee(int id, int employeeId, String employeeName, String employeeDept, Date employeeDOJ,
			Date employeeDOB, String employeeRole, String employeeAddress, long employeeSalary) {
		super();
		this.id = id;
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeDept = employeeDept;
		this.employeeDOJ = employeeDOJ;
		this.employeeDOB = employeeDOB;
		this.employeeRole = employeeRole;
		this.employeeAddress = employeeAddress;
		this.employeeSalary = employeeSalary;
	}
	
	
	public Employee(int employeeId, String employeeName, String employeeDept, Date employeeDOJ,
			Date employeeDOB, String employeeRole, String employeeAddress, long employeeSalary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeDept = employeeDept;
		this.employeeDOJ = employeeDOJ;
		this.employeeDOB = employeeDOB;
		this.employeeRole = employeeRole;
		this.employeeAddress = employeeAddress;
		this.employeeSalary = employeeSalary;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeDept() {
		return employeeDept;
	}

	public void setEmployeeDept(String employeeDept) {
		this.employeeDept = employeeDept;
	}

	public Date getEmployeeDOJ() {
		return employeeDOJ;
	}

	public void setEmployeeDOJ(Date employeeDOJ) {
		this.employeeDOJ = employeeDOJ;
	}

	public Date getEmployeeDOB() {
		return employeeDOB;
	}

	public void setEmployeeDOB(Date employeeDOB) {
		this.employeeDOB = employeeDOB;
	}

	public String getEmployeeRole() {
		return employeeRole;
	}

	public void setEmployeeRole(String employeeRole) {
		this.employeeRole = employeeRole;
	}

	public String getEmployeeAddress() {
		return employeeAddress;
	}

	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}

	public long getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(long employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	public Employee() {
		super();
	}

}
