package com.indra.curso.services;

import java.util.List;
import java.util.Optional;

import com.indra.curso.entity.Employee;

public interface EmployeeServices {
		
	public List<Employee> findAllEmployees();
	
	public Optional<Employee> findEmployeeById(Integer id);
	
	public Employee saveEmployee(Employee employeeNew);
	
	public String deleteEmployee(Integer id);
	
	public String updateEmployee(Employee EmployeeNew);

}
