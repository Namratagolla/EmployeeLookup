package com.atmecs.model;

import javax.persistence.Id;
import javax.validation.constraints.NotNull;


public class Employee {
	
	public Employee(){
		
	}
	
	public Employee(@NotNull int employeeId, String employeeFName, String employeeLName, String employeeRole
			) {
		super();
		this.employeeId = employeeId;
		this.employeeFName = employeeFName;
		this.employeeLName = employeeLName;
		this.employeeRole = employeeRole;
	}

	@Id
	@NotNull
	private int employeeId;
	private String employeeFName;
	private String employeeLName;
	private String employeeRole;
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeFName() {
		return employeeFName;
	}
	public void setEmployeeFName(String employeeFName) {
		this.employeeFName = employeeFName;
	}
	public String getEmployeeLName() {
		return employeeLName;
	}
	public void setEmployeeLName(String employeeLName) {
		this.employeeLName = employeeLName;
	}
	public String getEmployeeRole() {
		return employeeRole;
	}
	public void setEmployeeRole(String employeeRole) {
		this.employeeRole = employeeRole;
	}
	
}
