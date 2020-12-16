package com.indra.curso.controller;

import java.util.List;
import java.util.Optional;

import com.indra.curso.entity.Location;

public interface LocationController {
	//C
	public String addLocation(Location locationNew);
	//R
	public List<Location> findallLocation();
	public Optional<Location> findByIdLocation(Integer locationid);
	//U
	public String updateLocation(Location locationUpdate);
	//D
	public String deleteLocation(Integer locationid);
}
