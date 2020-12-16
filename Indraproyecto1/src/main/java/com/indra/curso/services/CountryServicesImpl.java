package com.indra.curso.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.indra.curso.repository.CountryRepository;
import com.indra.curso.entity.Country;
import java.util.List;
import java.util.Optional;

@Service
public class CountryServicesImpl implements CountryServices {
	
	@Autowired
	CountryRepository countryRepository;
	
	@Override
	public List<Country> findAllCountries() {
		return countryRepository.findAll();
	}
	
	@Override
	public Optional<Country> findCountryById(String countryid){
		Optional <Country> country = countryRepository.findById(countryid);
		return country;
	}
	
	@Override
	public Country saveCountry(Country countryNew) {
			return countryRepository.save(countryNew);
	}

	@Override
	public String deleteCountry(String countryid) {
		if(countryRepository.findById(countryid).isPresent()) {
			countryRepository.deleteById(countryid);
			return "Pais Borrado exitosamente!";
		}
		return "El pais no existe!";
	}

	@Override
	public String updateCountry(Country countryupdate) {
		String code = countryupdate.getCountryid();
		if(countryRepository.findById(code).isPresent()) {
			Country countryToUpdate = new Country();
			countryToUpdate.setCountryid(countryupdate.getCountryid());
			countryToUpdate.setCountryname(countryupdate.getCountryname());
			countryToUpdate.setRegionid(countryupdate.getRegionid());
			countryRepository.save(countryToUpdate);
			return "1";
		}
		return "0";
	}

	
}
