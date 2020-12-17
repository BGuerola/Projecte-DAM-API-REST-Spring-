package com.justaproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.justaproject.modelo.Candidato;
import com.justaproject.services.CandidatoService;

@RestController
public class CandidatoController {
	
	@Autowired
	CandidatoService service;

	@GetMapping("/candidato")
	public List<Candidato>getAll(){
		return service.getAll();
	}
		
	@GetMapping("/candidato/{id}")
	public Candidato getOne(@PathVariable (value="id")Integer id){
		return service.get(id);
	}
}
