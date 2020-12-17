package com.indra.curso.controller;

import java.util.List;
import java.util.Optional;

import com.indra.curso.entity.Jobhistory;

public interface JobhistoryController {
	//C
	public Jobhistory saveCountry(Jobhistory JobhistoryNew);
	//R
	public List<Jobhistory> findAllCountries();
	public Optional<Jobhistory> findCountryById(String employeeid);
	//U
	public String updateCountry(Jobhistory Jobhistoryupdate);
	//D
	public String deleteCountry(String employeeid);
}
