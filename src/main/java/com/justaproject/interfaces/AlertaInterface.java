package com.justaproject.interfaces;

import java.util.List;

import com.justaproject.modelo.Alerta;

public interface AlertaInterface {


	public Alerta get (Integer id);
	public List<Alerta>getAll();
	public void create(Alerta alerta);
	public void update(Alerta alerta, Integer id);
	public void delete(Integer id);
	
	
}
