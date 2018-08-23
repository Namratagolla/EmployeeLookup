package com.atmecs.test.controller;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.core.MediaType;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.atmecs.controller.EmployeeController;
import com.atmecs.model.Employee;
import com.atmecs.service.EmployeeService;

@RunWith(SpringRunner.class)
@WebMvcTest(value=EmployeeController.class, secure=false)
public class EmployeeControllerTest {
	
	@Autowired
	private MockMvc mockmvc;
	
	@MockBean
	private EmployeeService employeeService;
	
	
}
