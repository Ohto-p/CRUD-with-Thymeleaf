package com.indra.curso.services;

import java.util.List;
import java.util.Optional;

import com.indra.curso.entity.Department;

public interface DepartmentServices  {
	
	//C
	public String createDepartment(Department department);
	//R
	public List<Department> findallDepartment();
	
	//probando templates para ver departamentos 
	public Optional <Department> findDepartmentById(Integer departmentid);
	
	//U
	public String updateDepartment(Department deparmentUpdate);
	//D
	public String deleteDepartment(Integer deparmentid);

}
