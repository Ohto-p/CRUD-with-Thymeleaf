package com.indra.curso.services;

import java.util.List;
import java.util.Optional;

import com.indra.curso.entity.Jobhistory;

public interface JobHistoryServices {
		//C
		public Jobhistory saveJobhistory(Jobhistory JobhistoryNew);
		//R
		public List<Jobhistory> findAllJobhistory();
		public Optional<Jobhistory> findJobhistoryById(Integer employeeid);
		
		//U
		public String updateJobhistory(Jobhistory Jobhistoryupdate);
		//D
		public String deleteJobhistory(Integer employeeid);
}
