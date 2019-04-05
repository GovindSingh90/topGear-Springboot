package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.dao.EmployeeDao;
import com.example.model.Employee;

public class EmployeeServiceImp implements EmployeeService {
	
@Autowired
 EmployeeDao employeeDao;
	
	public List<Employee> getEmployees(){
		return employeeDao.findAll();
	}
	public Employee addNewEmployee(Employee emp) {
		return employeeDao.save(emp);
		
	}

}
