package com.justaproject.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.justaproject.modelo.Autenticacion;

import com.justaproject.services.AutenticacionService;

@RestController
public class AutenticacionController {

	@Autowired
	private AutenticacionService service;
	
	@GetMapping("/autenticats")
	public List<Autenticacion>getAllAutenticats(){
		return service.getAll();
	}
		
	@GetMapping("/autenticats/{id}")
	public Autenticacion getOne(@PathVariable (value="id")String id){
		return service.get(id);
	}

}
