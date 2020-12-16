package com.indra.curso.controller;

import java.util.List;
import java.util.Optional;

import com.indra.curso.entity.Region;

public interface RegionController {
	//C
	public String addRegion(Region regionNew);
	//R
	public List<Region> findAllRegion();
	public Optional<Region> findByIdRegion(Integer regionid);
	//U
	public String updateRegion(Region regionUpdate);
	//D
	public String deleteRegion(Integer regionid);
}
