package com.indra.curso.controller;

import java.util.List;
import java.util.Optional;

import com.indra.curso.entity.Employee;

public interface EmployeeControler {
	//C
	public Employee addEmployee(Employee employee);
	
	//R
	public List<Employee> getEmployee();
	public Optional <Employee> getEmployeeById(Long id);
	
	//U
	public String updateEmployee(Employee employee);
	
	//D
	public String deleteEmployeeById(Long id);
	
	
}
