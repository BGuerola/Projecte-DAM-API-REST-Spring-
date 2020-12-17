package com.justaproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.justaproject.modelo.Idiomas;
import com.justaproject.services.IdiomaService;

@RestController
public class IdiomasController {

	@Autowired
	IdiomaService service;
	
	@GetMapping("/idiomas")
	public List<Idiomas>getAll(){
		return service.getAll();
	}
	
	@GetMapping("/idiomas/{}id")
	public Idiomas getone(@PathVariable (value="id")Integer id) {
		return service.get(id);
	}
	
}
