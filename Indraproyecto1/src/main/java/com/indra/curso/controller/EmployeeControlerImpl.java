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

import com.indra.curso.entity.Employee;
import com.indra.curso.services.EmployeeServices;


@Controller 
@RequestMapping(value="/home/employee")
public class EmployeeControlerImpl {
	
	@Autowired
	EmployeeServices employeeService;
	
	//http://localhost:8080/Home/employee/ver     (Checked)
	@GetMapping("/ver")
	public String getEmployees(Model model) {
		List<Employee> empleado = employeeService.findAllEmployees();
		model.addAttribute("employee", empleado);
		return "Employee/Employee";
	}
	
	//http://localhost:8080/home/employee/ver/1  (Checked)
	@GetMapping("/ver/{id}")
	public String getEmployeeById(@PathVariable Integer id, Model model){
		Optional<Employee> empleado = employeeService.findEmployeeById(id);
		model.addAttribute("empleado", empleado);
		return "Employee/EmployeeC";
	}

	//http://localhost:8080/home/employee/crear  (Checked)
	@GetMapping("/crear")
	public String createEmployee() {
		return "Employee/formemployee";
	}
	@PostMapping("/add")
	public String addEmployee(Employee employee) {
		System.out.println(employee);	
		employeeService.saveEmployee(employee);
			
			return "redirect:/home/employee/ver";
	}
	

	//http://localhost:8080/home/employee/actualizar  
	
	@GetMapping("/actualizar/{employeeid}")
	public String actualizarEmployee(@PathVariable Integer employeeid, Model model ) {
		Optional<Employee> empleado = employeeService.findEmployeeById(employeeid);
		model.addAttribute("empleado", empleado);
		return "/Employee/ActualizarEmployee";
	}
	
	@PostMapping("/update")
	public String Update(Employee employeeupdate) {
		 employeeService.updateEmployee(employeeupdate);
		 return "redirect:/home/employee/ver";
	}
	

	//http://localhost:8080/home/employee/borrar/{id}    (Checked)
	@GetMapping("/borrar/{id}")
	public String deleteEmployee(@PathVariable Integer id) {
		employeeService.deleteEmployee(id);
		return "redirect:/home/employee/ver";
	}
}
