package com.justaproject.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="ALERTA")
public class Alerta implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id 
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name ="id_alerta")
	private int idalerta;
	@Column(name=("denominacio"))
	private String denominacio;
	@Column(name="localitat")
	private String localitat;
	
	public Alerta() {
	}

	public Alerta(int idalerta, String denominacio, String localitat) {
		super();
		this.idalerta = idalerta;
		this.denominacio = denominacio;
		this.localitat = localitat;
	}

	public int getIdalerta() {
		return idalerta;
	}

	public void setIdalerta(int idalerta) {
		this.idalerta = idalerta;
	}

	public String getDenominacio() {
		return denominacio;
	}

	public void setDenominacio(String denominacio) {
		this.denominacio = denominacio;
	}

	public String getLocalitat() {
		return localitat;
	}

	public void setLocalitat(String localitat) {
		this.localitat = localitat;
	}
	
	
}
