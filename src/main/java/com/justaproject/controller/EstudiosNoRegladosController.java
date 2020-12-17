package com.justaproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.justaproject.modelo.EstudiosNoReglados;
import com.justaproject.services.EstudiosNoRegladosService;

@RestController
public class EstudiosNoRegladosController {

	@Autowired
	EstudiosNoRegladosService service;
	
	@GetMapping("/estudiosnoreglados")
	public List<EstudiosNoReglados>getAll(){
		return service.getAll();
	}
	
	@GetMapping("/estudiosnoreglados/{}id")
	public EstudiosNoReglados getone(@PathVariable (value="id")Integer id) {
		return service.get(id);
	}
}
