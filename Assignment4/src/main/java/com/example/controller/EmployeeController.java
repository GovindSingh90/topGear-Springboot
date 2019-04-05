package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.model.Employee;
import com.example.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	public List<Employee> getEmployees() {
		System.out.println(this.getClass().getSimpleName() + " - Get all employees service is invoked.");
		return employeeService.getEmployees();
	}

	@RequestMapping(value = "/employee/add", method = RequestMethod.POST)
	public Employee createEmployee(@RequestBody Employee newemp) {
		System.out.println(this.getClass().getSimpleName() + " - Create new employee method is invoked.");
		
		return employeeService.addNewEmployee(newemp);
	}
}