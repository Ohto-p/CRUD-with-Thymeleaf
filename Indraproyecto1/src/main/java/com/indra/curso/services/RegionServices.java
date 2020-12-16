package com.indra.curso.services;

import java.util.List;
import java.util.Optional;

import com.indra.curso.entity.Region;

public interface RegionServices {
	//C
	public String addRegion(Region regionNew);
	//R
	public List<Region> findallRegion();
	public Optional<Region> findByIdRegion(Integer regionid);
	//U
	public String updateRegion(Region regionUpdate);
	//D
	public String deleteRegion(Integer regionid);
}
