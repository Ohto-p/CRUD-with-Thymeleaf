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

import com.indra.curso.entity.Region;
import com.indra.curso.services.RegionServices;

@Controller
@RequestMapping("/home/region")
public class RegionControllerImpl {
	@Autowired
	RegionServices regionServices;
	
	//C
	@GetMapping("/crear")
	public String crearRegion() {
		return "Region/formregion";
	}
	@PostMapping("/add")
	public String addRegion(Region regionNew) {
		regionServices.addRegion(regionNew);
		return "redirect:/home/region/ver";
	}
	//R
	@GetMapping("/ver")
	public String findAllRegion(Model model){
		List<Region> region = regionServices.findallRegion();
		model.addAttribute("region", region);
		return "Region/Region";
	}
	@GetMapping("/ver/{regionid}")
	public Optional<Region> findByIdRegion(@PathVariable Integer regionid){
		return regionServices.findByIdRegion(regionid);
	}
	//U
	@GetMapping("/actualizar/{regionid}")
	public String actualizarRegion(@PathVariable Integer regionid, Model model) {
		Optional<Region> region = regionServices.findByIdRegion(regionid);
		model.addAttribute("region", region);
		return "Region/ActualizarRegion";
	}
	@PostMapping("/update")
	public String updateRegion(Region regionUpdate) {
		regionServices.updateRegion(regionUpdate);
		return "redirect:/home/region/ver";
	}
	//D
	@GetMapping("/borrar/{regionid}")
	public String deleteRegion(@PathVariable Integer regionid) {
		regionServices.deleteRegion(regionid);
		return "redirect:/home/region/ver";
	}
}
