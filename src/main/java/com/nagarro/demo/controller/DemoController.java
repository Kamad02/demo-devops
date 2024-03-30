package com.nagarro.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.demo.model.Employee;

@RestController
public class DemoController {
	
	@GetMapping("/employee")
	public Employee firstPage() {
		Employee emp = new Employee();
		
		emp.setName("John Doe");
		emp.setEmpId("1001");
		emp.setDesignation("Manager");
		emp.setSalary(30000.00);
		
		return emp;
	}
}
