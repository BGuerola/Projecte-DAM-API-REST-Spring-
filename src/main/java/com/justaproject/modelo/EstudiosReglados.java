package com.justaproject.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ESTUDIOS_REGLADOS")
public class EstudiosReglados implements java.io.Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public enum Nivel {
		A("Estudios Universitarios"), 
		B("FPII/CFGS"), 
		C("Bachillerato/FP1/CFGM"), 
		D("ESO"), 
		E("Certificado de escolaridad/básica"), 
		F("Sin estudios");
		  final private String value; 
		  Nivel(String s) { 
		    value = s;
		  }
	}
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id_estreglados;
	@Column(name="id_cand")
	private int id_cand;
	@Enumerated(EnumType.STRING)
	@Column(name="nivel")
	private Nivel nivel;
	@Column(name="título")
	private String título;
	@Column(name="fcha")
	private String fchaInicio;
	@Column(name="fchaFin")
	private String fchaFin;
	@Column(name="Centro")
	private String Centro;
	
	
	public EstudiosReglados() {
	}
	public EstudiosReglados(Nivel nivel, String título, String fchaInicio,
			String fchaFin, String centro) {
		super();
		this.nivel = nivel;
		this.título = título;
		this.fchaInicio = fchaInicio;
		this.fchaFin = fchaFin;
		Centro = centro;
	}
	public int getId_estreglados() {
		return id_estreglados;
	}
	public void setId_estreglados(int id_estreglados) {
		this.id_estreglados = id_estreglados;
	}
	
	public int getId_cand() {
		return id_cand;
	}
	public void setId_cand(int id_cand) {
		this.id_cand = id_cand;
	}
	public Nivel getNivel() {
		return nivel;
	}
	public void setNivel(Nivel nivel) {
		this.nivel = nivel;
	}
	public String getTítulo() {
		return título;
	}
	public void setTítulo(String título) {
		this.título = título;
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
