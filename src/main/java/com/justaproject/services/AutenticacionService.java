package com.justaproject.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.justaproject.dao.AutenticacionDAO;
import com.justaproject.interfaces.AutenticacionInterface;
import com.justaproject.modelo.Autenticacion;

@Service
public class AutenticacionService implements AutenticacionInterface{
	
	@Autowired
	AutenticacionDAO autendao;
	
	@Override
	public Autenticacion get(String id) {
		return autendao.findById(id).get();
	}

	@Override
	public List<Autenticacion> getAll() {
		// TODO Auto-generated method stub
		return (List<Autenticacion>) autendao.findAll();
	}	
}
