package com.indra.curso.services;

import java.util.List;
import java.util.Optional;

import com.indra.curso.entity.Jobs;

public interface JobsServices  {
	
	//C
	public String addJob(Jobs job);
	//R
	public List<Jobs> findalljobs();
	public Optional<Jobs> findJobsById(String jobid);
	//U
	public String updateJob(Jobs jobUpdate);
	//D
	public String deleteJob(String jobid);

}
