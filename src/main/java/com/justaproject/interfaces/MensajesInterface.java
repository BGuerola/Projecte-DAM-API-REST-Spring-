package com.justaproject.interfaces;

import java.util.List;
import com.justaproject.modelo.Mensajes;

public interface MensajesInterface {
	
	public Mensajes get (Integer id);
	public List<Mensajes>getAll();
	public void create(Mensajes mensajes);

}
