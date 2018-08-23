package com.atmecs.test.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.atmecs.model.Employee;
import com.atmecs.service.EmployeeService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeServiceTest {

	@Autowired
	EmployeeService employeeService;
	
	@Autowired
	@Qualifier("getStrEmployeeController")
	String getStr;
	
	@Test
	public void getEmployeeSuccessTest() {
		System.out.println("getStr : " + getStr);
//		EmployeeService employeeService = new EmployeeService();
		Employee employee = employeeService.getEmployee(101);
		Assert.assertNotNull(employee);
		Assert.assertEquals(employee.getEmployeeId(), 101);
		Assert.assertEquals(employee.getEmployeeFName(), "David");
	}

	@Test(expected = NullPointerException.class)
	public void getEmployee_employeeNotFoundTest() {
//		EmployeeService employeeService = new EmployeeService();
		employeeService.getEmployee(201);
	}

}
