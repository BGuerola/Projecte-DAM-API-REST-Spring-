package com.justaproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.justaproject.modelo.Mensajes;
import com.justaproject.services.MensajesService;

@RestController
public class MensajesController {

	@Autowired
	MensajesService service;
	
	@GetMapping("/mensajes")
	public List<Mensajes>getAll(){
		return service.getAll();
	}
	
	@GetMapping("/mensajes/{id}")
	public Mensajes getOne(@PathVariable (name="id") int id ){
		return service.get(id);
	}
	
	@PostMapping("/mensajes")
	public void create(@RequestBody Mensajes mensaje) {
		service.create(mensaje);
	}
	
}
