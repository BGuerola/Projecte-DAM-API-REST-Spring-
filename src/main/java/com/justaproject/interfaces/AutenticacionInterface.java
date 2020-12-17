package com.justaproject.interfaces;

import java.util.List;
import com.justaproject.modelo.Autenticacion;

public interface AutenticacionInterface {
	public Autenticacion get (String id);
	public List<Autenticacion>getAll();
}
