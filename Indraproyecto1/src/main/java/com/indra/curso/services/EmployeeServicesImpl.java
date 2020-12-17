package com.indra.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.indra.curso.entity.Employee;
import com.indra.curso.repository.EmployeeRepository;
import com.indra.curso.repository.JobHistoryRepository;

@Service
public class EmployeeServicesImpl implements EmployeeServices {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	@Autowired
	JobHistoryRepository jobhostoryRepository;
	
	@Override
	public List<Employee> findAllEmployees(){
		return employeeRepository.findAll();
	}
	
	@Override
	public Optional<Employee> findEmployeeById(Integer id){
		Optional<Employee> employee = employeeRepository.findById(id);
		return  employee;
	}
	
	@Override
	public Employee saveEmployee(Employee employeeNew) {
		return employeeRepository.save(employeeNew);
	}
	
	@Override     //revisar la tabla de job_History para datos relacionados 
	public String deleteEmployee(Integer id) {
		if(employeeRepository.findById(id).isPresent()) {
			employeeRepository.deleteById(id);
			return "Empleado elimidado correctamente.";
		}
		return "Error! El empleado no existe";
	}
	
	@Override 
	public String updateEmployee(Employee employeeUpdated) {
		
		Integer num = employeeUpdated.getEmployeeid();
		if(employeeRepository.findById(num).isPresent()) {
			employeeRepository.save(employeeUpdated);
			return "Empleado modificado";
		}
		return "!Error al modificar el Empleado";
	}
	
	
}
