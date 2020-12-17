package com.justaproject.modelo;

import java.io.Serializable;
import javax.persistence.Embeddable;

@Embeddable
public class InscritoId implements Serializable{
	
	/**
	 * 
	 */
private static final long serialVersionUID = 1L;
	public int idcand;
	public int idOfertaTreball;
	
	public InscritoId() {
	}
		
	public InscritoId(int idcand, int idOfertaTreball) {
		this.idcand = idcand;
		this.idOfertaTreball = idOfertaTreball;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idOfertaTreball;
		result = prime * result + idcand;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		InscritoId other = (InscritoId) obj;
		if (idOfertaTreball != other.idOfertaTreball)
			return false;
		if (idcand != other.idcand)
			return false;
		return true;
	}
	
	
	
	

}
