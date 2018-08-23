package com.atmecs.controller;

import java.util.List;

import javax.ws.rs.InternalServerErrorException;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.atmecs.service.EmployeeService;
import com.atmecs.exceptions.DataNotFoundException;
import com.atmecs.model.Employee;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@Bean
	public String getStrEmployeeController(){
		return "this is getStr Bean from controller class";
	}

	@RequestMapping("/employees")
	public List<Employee> getAllEmployees(){
		return employeeService.getallEmployees();
	}
	
	@RequestMapping("/employees/{id}")
	public Employee getEmployee(@PathVariable int id) throws Exception {
		Employee employee;
		try{
			employee = employeeService.getEmployee(id);
			//if(employee.equals(null)) throw new DataNotFoundException("The requested id " + id + " not found");
		}catch(NullPointerException ex){
			throw new DataNotFoundException("The requested id " + id + " not found");
		}
		return employee;		
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/employees")
	public ResponseEntity<?> addEmployee(@RequestBody Employee employee){
		employeeService.addEmployee(employee);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/employees/{id}")
	public void updateEmployee(@PathVariable int id, @RequestBody Employee employee){
		employeeService.updateEmployee(id,employee);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/employees/{id}")
	public void deleteEmployee(@PathVariable int id){
		employeeService.deleteEmployee(id);
	}
	
}