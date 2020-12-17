package com.justaproject.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="IDIOMAS")
public class Idiomas implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public enum NivId{A1, A2, B1,B2, C1, C2};
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int Id_idiomas;
	@Column(name="idioma")
	private String idioma;
	@Enumerated(EnumType.STRING)
	@Column(name="Nivel")
	private NivId Nivel;
	//ací caldrà posar un @OnetoOne y @JoinColumn
	@Column(name="id_cand")
	private int id_cand;
	//ací caldrà posar un @OnetoOne y @JoinColumn
	@Column(name="id_ofertatreball")
    private int idOferta;
	
	public Idiomas() {
	}

	public Idiomas(String idioma, NivId nivel, int id_cand, int idOferta) {
		super();
		this.idioma=idioma;
		Nivel = nivel;
		this.id_cand = id_cand;
		this.idOferta = idOferta;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public int getId_idiomas() {
		return Id_idiomas;
	}

	public void setId_idiomas(int id_idiomas) {
		Id_idiomas = id_idiomas;
	}

	public NivId getNivel() {
		return Nivel;
	}

	public void setNivel(NivId nivel) {
		Nivel = nivel;
	}

	public int getId_cand() {
		return id_cand;
	}

	public void setId_cand(int id_cand) {
		this.id_cand = id_cand;
	}

	public int getId_ofertatreball() {
		return idOferta;
	}

	public void setId_ofertatreball(int idOferta) {
		this.idOferta = idOferta;
	}
	
	
	
	
	
}
