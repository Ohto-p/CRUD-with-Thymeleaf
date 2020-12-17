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
		String id = countryupdate.getCountryid();
		if(countryRepository.findById(id).isPresent()){
			countryRepository.save(countryupdate);
			return "Pais actualizado correctamente!";
		}
		return "Error al actualizar el pais";
	}

	
}
