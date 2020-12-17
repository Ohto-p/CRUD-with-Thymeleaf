package com.indra.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.indra.curso.entity.Jobhistory;
import com.indra.curso.repository.JobHistoryRepository;

@Service
public class JobHistoryServicesImpl implements JobHistoryServices {

	@Autowired
	JobHistoryRepository jobhistoryRepository;

	@Override
	public Jobhistory saveJobhistory(Jobhistory JobhistoryNew) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Jobhistory> findAllJobhistory() {
		return jobhistoryRepository.findAll();
	}

	@Override
	public Optional<Jobhistory> findJobhistoryById(Integer employeeid) {
		return jobhistoryRepository.findById(employeeid);
	}

	@Override
	public String updateJobhistory(Jobhistory Jobhistoryupdate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteJobhistory(Integer employeeid) {
		if(jobhistoryRepository.findById(employeeid).isPresent()) {
			jobhistoryRepository.deleteById(employeeid);;
			return "Trabajo eliminado correctamente!";
		}
		return "No se pudo eliminar el trabajo";
	}

	
	

}
