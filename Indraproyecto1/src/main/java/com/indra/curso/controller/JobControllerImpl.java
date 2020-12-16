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

import com.indra.curso.entity.Jobs;
import com.indra.curso.services.JobsServices;

@Controller
@RequestMapping(value="/home/jobs")
public class JobControllerImpl {
	
	@Autowired
	JobsServices jobservices;
	
	//C
	@GetMapping("/crear")
	public String crearjob(){
		return "/Jobs/formjobs";
	}
	
	@PostMapping("/add")
	public String addJob(Jobs jobnew){
		jobservices.addJob(jobnew);
		return "redirect:/home/jobs/ver";
	}
	//R
	@GetMapping("/ver")
	public String findalljobs(Model model){
		List<Jobs> job = jobservices.findalljobs();
		model.addAttribute("job", job);
		return "/Jobs/Jobs";
		
	}
	@GetMapping("/ver/{jobid}")
	public Optional<Jobs> findjobById(@PathVariable String jobid){
		return jobservices.findJobsById(jobid);
	}
	//U
	@GetMapping("/actualizar/{jobid}")
	public String actualizarJob(@PathVariable String jobid, Model model ) {
		Optional<Jobs> job = jobservices.findJobsById(jobid);
		model.addAttribute("job", job);
		return "/Jobs/Actualizarjobs";
	}
	
	@PostMapping("/update")
	public String jobUpdate(Jobs jobUpdate) {
		jobservices.updateJob(jobUpdate);
		return "redirect:/home/jobs/ver";
	}
	//D
	@GetMapping("/borrar/{jobid}")
	public String jobDelete(@PathVariable String jobid) {
		jobservices.deleteJob(jobid);
		return "redirect:/home/jobs/ver";	
	}
}
