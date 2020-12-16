package com.indra.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.indra.curso.entity.Department;
import com.indra.curso.repository.DepartmentRepository;

@Service
public class DepartmentServicesImpl implements DepartmentServices {
	
	
	
	@Autowired
	DepartmentRepository departmentRepository;
	
	
	
	//C
	public String createDepartment(Department department) {
		departmentRepository.save(department);
		return "Departamento creado con exito!";
	}
	//R
	@Override
	public List<Department> findallDepartment() {
		return  departmentRepository.findAll();
	}

	@Override
	public Optional <Department> findDepartmentById(Integer departmentid) {
		Optional <Department> department = departmentRepository.findById(departmentid);
		return department;
	}
	
	//U
	@Override
	public String updateDepartment(Department departmentUpdate) {
		Integer id = departmentUpdate.getDepartmentid();
		if(departmentRepository.findById(id).isPresent()){
			departmentRepository.save(departmentUpdate);
			return "Departamento actualizado correctamente!";
		}
		return "Error al actualizar el departamento";
	}
	
	//D
	@Override
	public String deleteDepartment(Integer departmentid) {
		if(departmentRepository.findById(departmentid).isPresent()) {
			departmentRepository.deleteById(departmentid);
			return "El departamento a sido borrado exitosamente!";
		}
		return "El departamento no existe!";
	}
	
}
