package com.justaproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.justaproject.modelo.Inscrito;
import com.justaproject.services.InscritoService;

@RestController
public class InscritoController {

	@Autowired
	InscritoService service;

	@GetMapping("/inscritos")
	public List<Inscrito>lista(){
		return service.getAll();
	}
	
	@GetMapping("/inscritos/{id}")
	public Inscrito getOne(@PathVariable (value="id") int id) {
		return service.get(id);
	}

	@PostMapping("/inscritos")
		public void add(Inscrito inscrito) {
			service.post(inscrito);
		}
}