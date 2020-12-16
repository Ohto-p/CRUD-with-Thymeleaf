package com.indra.curso.controller;

import java.util.List;
import java.util.Optional;

import com.indra.curso.entity.Jobs;

public interface JobController {
	
	//C
	public String addJob(Jobs jobnew);
	//R
	public List<Jobs> findalljobs();
	public Optional<Jobs> findjobById(String jobid);
	//U
	public String jobUpdate(Jobs jobupdate);
	//D
	public String jobDelete(String jobid);
	
}
