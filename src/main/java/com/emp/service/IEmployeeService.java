package com.emp.service;

import com.emp.model.Employee;

import java.util.List;

import java.util.Optional;

public interface IEmployeeService {
	
	Integer saveEmployee(Employee employee);
	
	public List<Employee> getAllEmployees();
	
	Optional<Employee> getEmployee(Integer id);
	
	public void deleteEmployee(Integer id);
}
