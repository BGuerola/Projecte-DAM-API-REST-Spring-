package com.justaproject.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.justaproject.dao.MensajesDAO;
import com.justaproject.interfaces.MensajesInterface;
import com.justaproject.modelo.Mensajes;

@Service
@Transactional
public class MensajesService implements MensajesInterface{
	
	@Autowired
	MensajesDAO dao;

	@Override
	public Mensajes get(Integer id) {
		return dao.findById(id).get();
	}

	@Override
	public List<Mensajes> getAll() {
		return (List<Mensajes>) dao.findAll();
	}

	@Override
	public void create(Mensajes mensajes) {
		dao.save(mensajes);
	}

}
