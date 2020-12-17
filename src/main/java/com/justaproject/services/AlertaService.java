package com.justaproject.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.justaproject.dao.AlertaDAO;
import com.justaproject.interfaces.AlertaInterface;
import com.justaproject.modelo.Alerta;

@Service
@Transactional
public class AlertaService implements AlertaInterface{

	@Autowired
	AlertaDAO dao;
	
	@Override
	public Alerta get(Integer id) {
		return dao.findById(id).get();
	}

	@Override
	public List<Alerta> getAll() {
		return (List<Alerta>) dao.findAll();
	}

	@Override
	public void create(Alerta alerta) {
		dao.save(alerta);
	}

	@Override
	public void update(Alerta alerta, Integer id) {
		dao.findById(id).ifPresent((x)-> {
			dao.save(alerta);
		});
	}

	@Override
	public void delete(Integer id) {
	dao.deleteById(id);
	}

}
