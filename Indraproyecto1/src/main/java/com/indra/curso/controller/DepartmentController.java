package com.indra.curso.controller;

import java.util.List;
import java.util.Optional;

import com.indra.curso.entity.Department;

public interface DepartmentController {
	//C
	//R
	public List<Department> findAllDepartment();
	public Optional<Department> findDepartmentById(Integer departmentid);
	//U
	//D
}
