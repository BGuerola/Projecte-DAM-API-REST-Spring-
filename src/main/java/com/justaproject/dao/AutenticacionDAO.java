package com.justaproject.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.justaproject.modelo.Autenticacion;

@Repository
public interface AutenticacionDAO extends CrudRepository<Autenticacion, String>{

	
}
