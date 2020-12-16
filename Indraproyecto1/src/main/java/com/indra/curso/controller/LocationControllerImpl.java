package com.indra.curso.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.indra.curso.entity.Location;
import com.indra.curso.services.LocationServices;

@Controller
@RequestMapping("/home/location")
public class LocationControllerImpl {
	
	@Autowired
	LocationServices locationServices;
	
	//C
	@GetMapping("/crear")
	public String crearlocation() {
		return "Location/formlocation";
	}
	@PostMapping("/add")
	public String addLocation(Location locationNew) {
		locationServices.addLocation(locationNew);
		return "redirect:/home/location/ver";
	}
	//R
	@GetMapping("/ver")
	public String findallLocation(Model model){
		List<Location> location = locationServices.findAllLocation();
		model.addAttribute("location",location);
		return "Location/Location";
	}
	@GetMapping("/ver/{locationid}")
	public Optional<Location> findByIdLocation(@PathVariable Integer locationid){
		return locationServices.findByIdLocation(locationid);
	}
	//U
	@GetMapping("/actualizar/{locationid}")
	public String actualizarlocation(@PathVariable Integer locationid, Model model) {
		Optional <Location> location = locationServices.findByIdLocation(locationid);
		model.addAttribute("location", location);
		return "Location/ActualizarLocation";
	}
	@PostMapping("/update")
	public String updateLocation(Location locationUpdate) {
		locationServices.updateLocation(locationUpdate);
		return "redirect:/home/location/ver";
	}
	//D
	@GetMapping("/borrar/{locationid}")
	public String deleteLocation(@PathVariable Integer locationid) {
		locationServices.deleteLocation(locationid);
		return "redirect:/home/location/ver";
	}
}
