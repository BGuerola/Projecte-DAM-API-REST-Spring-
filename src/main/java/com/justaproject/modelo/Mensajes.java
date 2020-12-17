package com.justaproject.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MENSAJES")

public class Mensajes implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name= "id_missatges")
	private int idmissat;
	@Column(name="id_cand")
	private int idcand;
	@Column(name="CIF")
    private String CIF;
    @Column(name="data_missatge")
	private String dataMstg;
	@Column(name="missatgeAUTENTICACION")
    private String misstg;
	
	public Mensajes() {
	}

	public Mensajes(int idmissat, int idcand, String cIF, String dataMstg, String misstg) {
		super();
		this.idmissat = idmissat;
		this.idcand = idcand;
		CIF = cIF;
		this.dataMstg = dataMstg;
		this.misstg = misstg;
	}

	public int getIdmissat() {
		return idmissat;
	}

	public void setIdmissat(int idmissat) {
		this.idmissat = idmissat;
	}

	public int getIdcand() {
		return idcand;
	}

	public void setIdcand(int idcand) {
		this.idcand = idcand;
	}

	public String getCIF() {
		return CIF;
	}

	public void setCIF(String cIF) {
		CIF = cIF;
	}

	public String getDataMstg() {
		return dataMstg;
	}

	public void setDataMstg(String dataMstg) {
		this.dataMstg = dataMstg;
	}

	public String getMisstg() {
		return misstg;
	}

	public void setMisstg(String misstg) {
		this.misstg = misstg;
	}

	
	
	
}
