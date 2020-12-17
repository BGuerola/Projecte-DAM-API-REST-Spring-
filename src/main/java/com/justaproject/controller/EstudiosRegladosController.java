package com.justaproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.justaproject.modelo.EstudiosReglados;
import com.justaproject.services.EstudiosRegladosService;

@RestController
public class EstudiosRegladosController {

	@Autowired
	EstudiosRegladosService service;
	
	@GetMapping("/estudiosreglados")
	public List<EstudiosReglados>getAll(){
		return service.getAll();
	}
	
	@GetMapping("/estudiosreglados/{}id")
	public EstudiosReglados getone(@PathVariable (value="id")Integer id) {
		return service.get(id);
	}
}
