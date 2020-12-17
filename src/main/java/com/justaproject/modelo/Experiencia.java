package com.justaproject.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EXPERIENCIA")
public class Experiencia implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name ="id_exp")
	private int idexp;
	@Column(name ="nomEmpr_exp")
	private String nomEmp;
	@Column(name ="nomPuesto")
	private String nomPuesto;
	@Column(name ="funciones")
	private String funciones;
	@Column(name ="CIF")
	private String CIF;
	@Column(name ="id_sal")
	private String salario;
	@Column(name ="fchaInicio")
	private String fchaInicio;
	@Column(name ="fchaFin")
	private String fchaFin;
	@Column(name ="personal_a_cargo")
	private String paxacargo;
	//ací caldrà posar un @OnetoOne y @JoinColumn
	@Column(name="id_cand")
	private int id_cand;
	
	public Experiencia() {
	}

	public Experiencia(String nomEmp, String nomPuesto, String funciones, String cIF, String salario, String fchaInicio,
			String fchaFin, String paxacargo, int id_cand) {
		super();
		this.nomEmp = nomEmp;
		this.nomPuesto = nomPuesto;
		this.funciones = funciones;
		CIF = cIF;
		this.salario = salario;
		this.fchaInicio = fchaInicio;
		this.fchaFin = fchaFin;
		this.paxacargo = paxacargo;
		this.id_cand = id_cand;
	}

	public int getIdexp() {
		return idexp;
	}

	public void setIdexp(int idexp) {
		this.idexp = idexp;
	}

	public String getNomEmp() {
		return nomEmp;
	}

	public void setNomEmp(String nomEmp) {
		this.nomEmp = nomEmp;
	}

	public String getNomPuesto() {
		return nomPuesto;
	}

	public void setNomPuesto(String nomPuesto) {
		this.nomPuesto = nomPuesto;
	}

	public String getFunciones() {
		return funciones;
	}

	public void setFunciones(String funciones) {
		this.funciones = funciones;
	}

	public String getCIF() {
		return CIF;
	}

	public void setCIF(String cIF) {
		CIF = cIF;
	}

	public String getSalario() {
		return salario;
	}

	public void setSalario(String salario) {
		this.salario = salario;
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

	public String getPaxacargo() {
		return paxacargo;
	}

	public void setPaxacargo(String paxacargo) {
		this.paxacargo = paxacargo;
	}

	public int getId_cand() {
		return id_cand;
	}

	public void setId_cand(int id_cand) {
		this.id_cand = id_cand;
	}
	
	
	
	
}
