package com.justaproject.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.justaproject.dao.IdiomasDAO;
import com.justaproject.interfaces.IdiomasInterface;
import com.justaproject.modelo.Idiomas;

@Service
@Transactional
public class IdiomaService implements IdiomasInterface{
	
	@Autowired
	IdiomasDAO dao;

	@Override
	public Idiomas get(Integer id) {
		return dao.findById(id).get();
	}

	@Override
	public List<Idiomas> getAll() {
		return (List<Idiomas>) dao.findAll();
	}

}
