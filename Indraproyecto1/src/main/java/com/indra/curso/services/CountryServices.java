package com.indra.curso.services;

import java.util.List;
import java.util.Optional;

import com.indra.curso.entity.Country;

public interface CountryServices {
	
	//C
	public Country saveCountry(Country countryNew);
	//R
	public List<Country> findAllCountries();
	public Optional<Country> findCountryById(String countryid);
	
	//U
	public String updateCountry(Country countryupdate);
	//D
	public String deleteCountry(String countryid);
	
}
