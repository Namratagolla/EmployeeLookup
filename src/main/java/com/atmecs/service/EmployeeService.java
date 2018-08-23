package com.atmecs.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import com.atmecs.model.Employee;

//this service returns Employee by Id
@Service
public class EmployeeService {

	@Bean
	public String getStr(){
		return "this is getStr Bean";
	}
	
	private List<Employee> employees = new ArrayList<>(Arrays.asList(
			new Employee(101,"David","Johnson","Java Developer"),
			new Employee(102,"Linda","Williams","Devops"),
			new Employee(103,"Peter","Wilson","Hiring Manager")
			));
	
	public List<Employee> getallEmployees(){
		return employees;
	}
	
	public Employee getEmployee(int id){
		for (Employee employee : employees) {
			if(employee.getEmployeeId() == id) return employee;
		}
		
		throw new NullPointerException("Employer with id : " + id + " doesn't exist");
		//return employees.stream().filter(e -> e.getEmployeeId() == id).findFirst().get();
	}

	public void addEmployee(Employee employee) {
		employees.add(employee);
	}

	public void updateEmployee(int id, Employee employee) {
		for(int i=0; i<employees.size(); i++){
			Employee e = employees.get(i);
			if(e.getEmployeeId() == id) employees.set(i, employee);
		}
	}

	public void deleteEmployee(int id) {
		for(int i=0; i<employees.size(); i++){
			Employee e = employees.get(i);
			if(e.getEmployeeId() == id) employees.remove(i);
		}
	}
}
