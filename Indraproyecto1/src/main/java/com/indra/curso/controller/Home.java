package com.indra.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.indra.curso.entity.Region;
import com.indra.curso.services.RegionServices;

@Controller
public class Home {
	@GetMapping("home")
	public String menuprincipal() {
		return "Home";
	}
	
	@Autowired
	RegionServices regionS;
	@GetMapping("prueba")
	public String prueb(Model model) {
		List <Region> prueba = regionS.findallRegion();
		model.addAttribute("prueba", prueba);
		return "prueba";
	}
	
	@PostMapping("mostrar")
	public String mostrar(String valor) {
		System.out.println("El valor es:" + valor);
		return "redirect:/home";
	}
	
}
