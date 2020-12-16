package com.indra.curso.controller;

import java.util.List;
import java.util.Optional;

import com.indra.curso.entity.Country;

public interface CountryController {
	
		//C
		public Country addController(Country country);
		//R
		public List<Country> getCountries();
		public Optional<Country> FindById(String countryid );
		//U
		public String updateCountry(Country countryupdate);
		//D
		public String deleteCountry(String countryid);
		
}
