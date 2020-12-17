package com.justaproject.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ESTUDIOS_NO_REGLADOS")
public class EstudiosNoReglados implements java.io.Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id_estnoreglados;
	//ací caldrà posar un @OnetoOne y @JoinColumn
	@Column(name="id_cand")
	private int id_cand;
	@Column(name="curso")
	private String curso;
	@Column(name="fchaInicio")
	private String fchaInicio;
	@Column(name="fchaFin")
	private String fchaFin;
	@Column(name="Centro")
	private String Centro;
	
	
	
	
	public EstudiosNoReglados() {
	}

	public EstudiosNoReglados(String curso, String fchaInicio, String fchaFin,
			String centro) {
		super();
		this.curso = curso;
		this.fchaInicio = fchaInicio;
		this.fchaFin = fchaFin;
		Centro = centro;
	}
		
	public int getId_cand() {
		return id_cand;
	}

	public void setId_cand(int id_cand) {
		this.id_cand = id_cand;
	}

	public int getId_estnoreglados() {
		return id_estnoreglados;
	}
	public void setId_estnoreglados(int id_estnoreglados) {
		this.id_estnoreglados = id_estnoreglados;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String getFchaInicio() {
		return fchaInicio;
	}
	public void setFchaInicio(String fchaInicio) {
		this.fchaInicio = fchaInicio;
	}
	public String getFchaFin() {
		return fchaFin;
	}
	public void setFchaFin(String fchaFin) {
		this.fchaFin = fchaFin;
	}
	public String getCentro() {
		return Centro;
	}
	public void setCentro(String centro) {
		Centro = centro;
	}	
	
}
