package com.justaproject.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.justaproject.dao.EstudiosRegladosDAO;
import com.justaproject.interfaces.EstudiosRegladosInterface;
import com.justaproject.modelo.EstudiosReglados;

@Service
@Transactional
public class EstudiosRegladosService implements EstudiosRegladosInterface{

	@Autowired
	EstudiosRegladosDAO dao;

	@Override
	public EstudiosReglados get(Integer id) {
		return dao.findById(id).get();
	}

	@Override
	public List<EstudiosReglados> getAll() {
		// TODO Auto-generated method stub
		return (List<EstudiosReglados>) dao.findAll();
	}
	
	
}
