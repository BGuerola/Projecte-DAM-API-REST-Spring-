package com.justaproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.justaproject.modelo.Alerta;
import com.justaproject.services.AlertaService;


@RestController
public class AlertaController {

	@Autowired
	AlertaService service;
	
	@GetMapping("/alerta")
	public List<Alerta>getAll(){
		return service.getAll();
	}
		
	@GetMapping("/alerta/{id}")
	public Alerta getOne(@PathVariable (value="id")Integer id){
		return service.get(id);
	}
	@PostMapping("/alerta")
	public void create(@RequestBody Alerta alerta) {
		service.create(alerta);
	}
	@PutMapping("/alerta/{id}")
	public void update (@RequestBody Alerta alerta, @PathVariable (value="id")Integer id) {
		service.update(alerta, id);
	}
	
	@DeleteMapping("/alerta/{id}")
		public void delete (@PathVariable (value="id")Integer id) {
			service.delete(id);
	}
	
}
