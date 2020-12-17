package com.justaproject.interfaces;

import java.util.List;
import com.justaproject.modelo.Inscrito;


public interface InscritoInterface{
	public Inscrito get (int id);
	public List<Inscrito>getAll();
	public void post(Inscrito inscrito);
}
