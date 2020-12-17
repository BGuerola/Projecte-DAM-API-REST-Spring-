package com.justaproject.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.justaproject.dao.InscritoDAO;
import com.justaproject.interfaces.InscritoInterface;
import com.justaproject.modelo.Inscrito;

@Service
public class InscritoService implements InscritoInterface{
	
	@Autowired
	InscritoDAO dao;

	@Override
	public Inscrito get(int id) {
		return dao.findById(id).get();
	}

	@Override
	public List<Inscrito> getAll() {
		return (List<Inscrito>) dao.findAll();
	}

	@Override
	public void post(Inscrito inscrito) {
		dao.save(inscrito);
		
	}
}
