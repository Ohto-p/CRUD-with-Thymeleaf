package com.indra.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.indra.curso.entity.Jobhistory;
import com.indra.curso.services.JobHistoryServices;

@Controller
@RequestMapping(value="/home/jobhistory")
public class JobhistoryControllerImpl {
	
	@Autowired
	JobHistoryServices jobhistoryServices;
	
	@GetMapping("/ver")
	public String findallJobhistorys(Model model){
		List<Jobhistory> jobh =jobhistoryServices.findAllJobhistory();
		model.addAttribute("jobh", jobh);
		return "Jobh/Jobh";
	}
	
	@GetMapping("/borrar/{id}")
	public String deletejobh(@PathVariable("id") Integer employeeid) {
		jobhistoryServices.deleteJobhistory(employeeid);
		return "redirect:/home/jobhistory/ver";
	}
	
	
}
