package com.justaproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.justaproject.modelo.Experiencia;
import com.justaproject.services.ExperienciaService;

@RestController
public class ExperienciaController {

	@Autowired
	ExperienciaService service;
	
	@GetMapping("/experiencia")
	public List<Experiencia>getAll(){
		return service.getAll();
	}
	
	@GetMapping("/experiencia/{}id")
	public Experiencia getone(@PathVariable (value="id")Integer id) {
		return service.get(id);
	}
}
