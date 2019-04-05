package com.example.service;

import java.util.List;
import java.util.Optional;

import com.example.model.Employee;


public interface EmployeeService {
	
	public List<Employee> getEmployees();
	public Employee addNewEmployee(Employee emp);

}
