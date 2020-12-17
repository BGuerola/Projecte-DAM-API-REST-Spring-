package com.justaproject.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.justaproject.dao.CandidatoDAO;
import com.justaproject.interfaces.CandidatoInterface;
import com.justaproject.modelo.Candidato;

@Service
@Transactional
public class CandidatoService implements CandidatoInterface{
	
	@Autowired
	CandidatoDAO dao;

	@Override
	public Candidato get(Integer id) {
		return dao.findById(id).get();
	}

	@Override
	public List<Candidato> getAll() {
		return (List<Candidato>) dao.findAll();
	}

}
