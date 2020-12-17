package com.justaproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.justaproject.modelo.OfertaTrabajo;
import com.justaproject.services.OfertaTrabajoService;

@RestController
public class OfertaTrabajoController {
	
	@Autowired
	OfertaTrabajoService service;
	
	@GetMapping("/ofertatrabajo")
	public List<OfertaTrabajo>getAll(){
		return service.getAll();
	}
	
	@GetMapping("/ofertatrabajo/{id}")
	public OfertaTrabajo getOne(@PathVariable (name="id") int id) {
		return service.get(id);
	}

}
