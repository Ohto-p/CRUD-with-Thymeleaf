package com.indra.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.indra.curso.entity.Region;
import com.indra.curso.repository.RegionRepository;

@Service
public class RegionServicesImpl implements RegionServices {
	
	@Autowired
	RegionRepository regionRepository;
	//C
	public String addRegion(Region regionNew) {
		regionRepository.save(regionNew);
		return "La region fue agregada correctamente!";
	}
	//R
	public List<Region> findallRegion(){
		return regionRepository.findAll();
	}
	public Optional<Region> findByIdRegion(Integer regionid){
		return regionRepository.findById(regionid); 
	}
	//U
	public String updateRegion(Region regionUpdate) {
		Integer code = regionUpdate.getRegionid();
		if(regionRepository.findById(code).isPresent()) {
			regionRepository.save(regionUpdate);
			return "Region actualizada correctamente!";
		}
		return "Error al actualizar la Region";
	}
	//D
	public String deleteRegion(Integer regionid) {
		if(regionRepository.findById(regionid).isPresent()) {
			regionRepository.deleteById(regionid);;
			return "Region eliminada correctamente!";
		}
		return "Error al eliminar la region";
	}
}
