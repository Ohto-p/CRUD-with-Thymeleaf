package com.indra.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.indra.curso.entity.Location;
import com.indra.curso.repository.LocationRepository;

@Service
public class LocationServicesImpl implements LocationServices {
	
	@Autowired
	LocationRepository locationRepository;
	
	//C
	public String addLocation(Location locationNew) {
		locationRepository.save(locationNew);
		return "Locacion agregada correctamente";
	}
	//R
	public List<Location> findAllLocation(){
		return locationRepository.findAll();
	}
	public Optional<Location> findByIdLocation(Integer locationid){
		return locationRepository.findById(locationid);
	}
	//U
	public String updateLocation(Location locationUpdate) {
		Integer code = locationUpdate.getLocationid();
		if(locationRepository.findById(code).isPresent()) {
			locationRepository.save(locationUpdate);
			return "Locacion modificada correctamente!";
		}
		return "Error al actualizar la locacion";
	}
	//D
	public String deleteLocation(Integer locationid) {
		if(locationRepository.findById(locationid).isPresent()) {
			locationRepository.deleteById(locationid);
			return "locacion eliminada correctamente!";
		}
		return "Error al eliminar la locacion";
	}
}
