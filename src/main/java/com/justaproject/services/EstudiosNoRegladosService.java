package com.justaproject.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.justaproject.dao.EstudiosNoRegladosDAO;
import com.justaproject.interfaces.EstudiosNoRegladosInterface;
import com.justaproject.modelo.EstudiosNoReglados;

@Service
@Transactional
public class EstudiosNoRegladosService implements EstudiosNoRegladosInterface{
	
	@Autowired
	EstudiosNoRegladosDAO dao;

	@Override
	public EstudiosNoReglados get(Integer id) {
		return dao.findById(id).get();
	}

	@Override
	public List<EstudiosNoReglados> getAll() {
		return (List<EstudiosNoReglados>) dao.findAll();
	}

}
