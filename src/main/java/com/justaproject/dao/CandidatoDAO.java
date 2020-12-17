package com.justaproject.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.justaproject.modelo.Candidato;

@Repository
public interface CandidatoDAO extends CrudRepository<Candidato, Integer>{
	
}
