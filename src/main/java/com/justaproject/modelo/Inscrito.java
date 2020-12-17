package com.justaproject.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name="INSCRITO")
@IdClass(InscritoId.class)
public class Inscrito implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public enum Estado {Inscrito,Finalista, Reservado, Descartado};
	
	@Id
	@Column(name="id_cand")
	private int idcand;
	
	@Id
	@Column(name="id_ofertatreball")
	private int idOfertaTreball;
	@Column(name="estado")
	private Estado estado;
	
	public Inscrito() {
	
	}

	public Inscrito(int idcand, int idOfertaTreball, Estado estado) {
		super();
		this.idcand = idcand;
		this.idOfertaTreball = idOfertaTreball;
		this.estado = estado;
	}

	public int getIdcand() {
		return idcand;
	}

	public void setIdcand(int idcand) {
		this.idcand = idcand;
	}

	public int getIdOfertaTreball() {
		return idOfertaTreball;
	}

	public void setIdOfertaTreball(int idOfertaTreball) {
		this.idOfertaTreball = idOfertaTreball;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	
	
	
}
