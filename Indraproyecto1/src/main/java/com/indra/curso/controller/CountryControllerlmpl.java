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
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.indra.curso.entity.Country;
import com.indra.curso.services.CountryServices;

@Controller
@RequestMapping(value = "/home/country")
public class CountryControllerlmpl {
	
	@Autowired
	CountryServices countryService;
	
	//Create
	@GetMapping("/crear")
	public String createCountry() {
		return "Country/formCountry";
	}
	
	@PostMapping("/add")    //agrega pero solo de la sig forma localhost:8080/home/country/add?countryid=HK&&countryname=Hong Kong&&regionid=3
	public String saveCountry(Country country , RedirectAttributes attributes) {
		if(countryService.findCountryById(country.getCountryid()).isPresent()) {
			attributes.addFlashAttribute("error", "El Country id ya existe");
			return "redirect:/home/country/ver";
		}
		countryService.saveCountry(country);
		attributes.addFlashAttribute("success", "Country Creado Exitosamente!");
		return "redirect:/home/country/ver"; 
				
	}
	//-----------------------------------------------------------------------------------------------------
	
	
	//Read all or only one
	
	//home/country/ver      (Checked)
	@GetMapping("/ver")
	public String findAllCountries(Model model){
		List <Country> paises = countryService.findAllCountries();	
		model.addAttribute("paises", paises);
		return "Country/country";
	}
	
	//home/country/ver/AR   (Checked)
	@GetMapping("/ver/{countryid}")
	public Optional<Country> findCountryById(@PathVariable String countryid){
		return countryService.findCountryById(countryid);	
	}
	
	//Update------------------------------------------------
	@GetMapping("/actualizar/{countryid}")
	public String actualizarCountry(@PathVariable String countryid, Model model) {
		Optional <Country> pais = countryService.findCountryById(countryid);
		model.addAttribute("pais", pais);
		return "Country/ActualizarCountry";
	}
	
	@PostMapping("/update")
	public String updateCountry(Country countryUpdate, RedirectAttributes attributes ) {
		String code = countryService.updateCountry(countryUpdate);
		if(code ==  "0") {
			attributes.addFlashAttribute("error", "Error al actualizar el pais");
			return "redirect:/home/country/ver";
		}
		attributes.addFlashAttribute("success", "Pais actualizado correctamente!");
		return "redirect:/home/country/ver";
	}
	
	
	
	//Delete only one      (Checked)
	@GetMapping("/borrar/{id}")
	public String deleteCountry(@PathVariable("id") String countryid) {		
		countryService.deleteCountry(countryid);
		return "redirect:/home/country/ver";
				
	}
	

}
