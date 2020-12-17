package com.justaproject.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.justaproject.dao.OfertaTrabajoDAO;
import com.justaproject.interfaces.OfertaTrabajoInterface;
import com.justaproject.modelo.Alerta;
import com.justaproject.modelo.OfertaTrabajo;

@Service
@Transactional
public class OfertaTrabajoService implements OfertaTrabajoInterface{

	@Autowired
	OfertaTrabajoDAO dao;

	@Override
	public OfertaTrabajo get(Integer id) {
		return dao.findById(id).get();
	}

	@Override
	public List<OfertaTrabajo> getAll() {
		// TODO Auto-generated method stub
		return (List<OfertaTrabajo>) dao.findAll();
	}
	
	
}
