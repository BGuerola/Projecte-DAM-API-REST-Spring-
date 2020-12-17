package com.justaproject.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.justaproject.dao.ExperienciaDAO;
import com.justaproject.interfaces.ExperienciaInterface;
import com.justaproject.modelo.Experiencia;

@Service
@Transactional
public class ExperienciaService implements ExperienciaInterface{

	@Autowired
	ExperienciaDAO dao;

	@Override
	public Experiencia get(Integer id) {
		return dao.findById(id).get();
	}

	@Override
	public List<Experiencia> getAll() {
		return (List<Experiencia>) dao.findAll();
	}
	
}
