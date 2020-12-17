package com.justaproject.interfaces;

import java.util.List;

import com.justaproject.modelo.Candidato;

public interface CandidatoInterface {
	
	public Candidato get (Integer id);
	public List<Candidato>getAll();
}
