package com.justaproject.interfaces;

import java.util.List;
import com.justaproject.modelo.OfertaTrabajo;

public interface OfertaTrabajoInterface {

	public OfertaTrabajo get (Integer id);
	public List<OfertaTrabajo>getAll();
	
}
