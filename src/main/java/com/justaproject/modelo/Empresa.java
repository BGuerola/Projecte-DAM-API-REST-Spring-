package com.justaproject.modelo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table (name="EMPRESA")
public class Empresa implements Serializable{
	
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id @GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	@Column(name="CIF")
	private String CIF;

	@Column(name="logo")
	private String logo;
	@Column(name="nombreEmp")
	private String nombreEmp;
	@Column(name="nombreCont")
	private String nombreCont;
	@Column(name="apellido1Cont")
	private String apellido1Cont;
	@Column(name="apellido2Cont")
	private String apellido2Cont;
	@Column(name="telfEmpre")
	private String telfEmp;
	@Column(name="empresaSelec")
	private String empresaSelec;
	@Column(name="descripEmp")
	private String descripEmp;
	@Column(name="localidad")
	private String localidad;
	@Column(name="codigo_postal")
	private int codigoPostal;
	@Column(name="provincia")
	private String provincia;
	//ací caldrà posar un @OnetoOne y @JoinColumn
	@Column(name ="email")
	private String email;
	
	public Empresa() {
	}

	public Empresa(String cIF, String logo, String nombreEmp, String nombreCont, String apellido1Cont,
			String apellido2Cont, String telfEmp, String empresaSelec, String descripEmp, String localidad,
			int codigoPostal, String provincia, String email) {
		super();
		CIF = cIF;
		this.logo = logo;
		this.nombreEmp = nombreEmp;
		this.nombreCont = nombreCont;
		this.apellido1Cont = apellido1Cont;
		this.apellido2Cont = apellido2Cont;
		this.telfEmp = telfEmp;
		this.empresaSelec = empresaSelec;
		this.descripEmp = descripEmp;
		this.localidad = localidad;
		this.codigoPostal = codigoPostal;
		this.provincia = provincia;
		this.email=email;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCIF() {
		return CIF;
	}

	public void setCIF(String cIF) {
		CIF = cIF;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getNombreEmp() {
		return nombreEmp;
	}

	public void setNombreEmp(String nombreEmp) {
		this.nombreEmp = nombreEmp;
	}

	public String getNombreCont() {
		return nombreCont;
	}

	public void setNombreCont(String nombreCont) {
		this.nombreCont = nombreCont;
	}

	public String getApellido1Cont() {
		return apellido1Cont;
	}

	public void setApellido1Cont(String apellido1Cont) {
		this.apellido1Cont = apellido1Cont;
	}

	public String getApellido2Cont() {
		return apellido2Cont;
	}

	public void setApellido2Cont(String apellido2Cont) {
		this.apellido2Cont = apellido2Cont;
	}

	public String getTelfEmp() {
		return telfEmp;
	}

	public void setTelfEmp(String telfEmp) {
		this.telfEmp = telfEmp;
	}

	public String getEmpresaSelec() {
		return empresaSelec;
	}

	public void setEmpresaSelec(String empresaSelec) {
		this.empresaSelec = empresaSelec;
	}

	public String getDescripEmp() {
		return descripEmp;
	}

	public void setDescripEmp(String descripEmp) {
		this.descripEmp = descripEmp;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public int getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}	
}
