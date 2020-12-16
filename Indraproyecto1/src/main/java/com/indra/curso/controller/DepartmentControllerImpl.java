package com.indra.curso.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.indra.curso.entity.Department;
import com.indra.curso.services.DepartmentServices;

@Controller
@RequestMapping(value = "/home/department")
public class DepartmentControllerImpl{
	
	@Autowired
	DepartmentServices departmentServices;
	//C
	//localhost:8080/home/department/add?...
	@GetMapping("/crear")
	public String createDepartment() {
		return "Department/formDepartment";
	}
	
	@PostMapping("/add")
	public String createDepartment(Department department) {
		System.out.println(department);
		departmentServices.createDepartment(department);
		return "redirect:/home/department/ver"; 
	}
	//R
	//localhost:8080/home/department/ver
	@GetMapping("/ver")
	public String findAllDepartment(Model model){
		List<Department> departments = departmentServices.findallDepartment(); 
		model.addAttribute("departments",departments);
		return "Department/deparment"; 
	}
	
	//localhost:8080/home/department/ver/{id}
	@GetMapping("/ver/{departmentid}")
	public Optional<Department> findByIdDepartment(@PathVariable Integer departmentid){
		Optional <Department> department = departmentServices.findDepartmentById(departmentid);
		return department;
	}
	
	//U
	@GetMapping("/actualizar/{departmentid}")
	public String actualizarDepartment(@PathVariable Integer departmentid, Model model) {
		Optional <Department> department = departmentServices.findDepartmentById(departmentid);
		model.addAttribute("department",department);
		return "Department/ActualizarDepartment";
	}
	
	
	@PostMapping("/update") 
	public String deparmentUpdate(Department deparmentUpdate) {
		departmentServices.updateDepartment(deparmentUpdate);
		return "redirect:/home/department/ver";
	}
	
	//D
	@GetMapping("/borrar/{departmentid}")
	public String deleteDepartment(@PathVariable Integer departmentid) {
		departmentServices.deleteDepartment(departmentid);
		return "redirect:/home/department/ver";
	}

}
