package com.indra.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.indra.curso.entity.Jobs;
import com.indra.curso.repository.JobRepository;

@Service
public class JobsServicesImpl implements JobsServices {
	
	@Autowired
	JobRepository jobRepository;
	//C
	public String addJob(Jobs job) {
		jobRepository.save(job);
		return"Trabajo creado con exito";
	}
	
	//R
	public List<Jobs> findalljobs(){
		return jobRepository.findAll(); 
	}
	
	public Optional<Jobs> findJobsById(String jobid){
		return jobRepository.findById(jobid);
	}
	//U
	public String updateJob(Jobs jobUpdate) {
		String code = jobUpdate.getJobid();
		if(jobRepository.findById(code).isPresent()) {
			jobRepository.save(jobUpdate);
			return "Trabajo actualizado correctamente";
		}
		return "Error al actualizar el trabajo";
	}
	
	//D
	public String deleteJob(String jobid) {
		if(jobRepository.findById(jobid).isPresent()) {
			jobRepository.deleteById(jobid);
			return "Trabajo eliminado correctamente!";
		}
		return "No se pudo eliminar el trabajo";
	}
}
