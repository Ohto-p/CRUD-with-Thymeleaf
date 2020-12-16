package com.indra.curso.services;

import java.util.List;
import java.util.Optional;

import com.indra.curso.entity.Location;

public interface LocationServices {
	//C
	public String addLocation(Location locationNew);
	//R
	public List<Location> findAllLocation();
	public Optional<Location> findByIdLocation(Integer locationid);
	//U
	public String updateLocation(Location locationUpdate);
	//D
	public String deleteLocation(Integer locationid);
}
