package com.justaproject.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Enumerated;
import javax.persistence.EnumType;

@Entity
@Table(name="CANDIDATO")
public class Candidato implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public enum Sexo {hombre,mujer}; 
	public enum SituacionLaboral {
		A("Trabajando"), 
		B("Desempleo"), 
		C("Mejora");
		  final private String value; 
		  SituacionLaboral(String s) { 
		    value = s;
		  }	
	};
	public enum Vehiculo {si, no};
	public enum Nacionalidad{Española, Europea, Extranjera};
	public enum Permiso {si, no};
	public enum Autonomo {si, no};
	
	
	public enum ComptPers {
		A("Trabajo en equipo"), 
		B("Resolución de conflictos"), 
		C("Toma de decisiones"), 
		D("Pensamiento positivo"), 
		E("Adaptación al cambio"), 
	    F("Comunicación eficaz"), 
	    G("Proactividad"), 
	    H("Liderazgo"), 
	    I("Creatividad"), 
	    J("Tolerancia a la presión"), 
	    K("Orientación a resultados");
		final private String value; 
		ComptPers(String s) { 
		    value = s;
		}
	};
	public enum ComptSoc {
		A("Escucha activa"), 
	    B("Asertividad"), 
		C("Empatía"), 
		D("Capacidad de negociación"), 
		E("Tolerancia"), 
		F("Honestidad"), 
		G("Receptividad/apertura de mente"), 
		H("Control emocional"), 
		I("Extroversión"), 
		J("Saber expresarse");
		final private String value; 
		ComptSoc(String s) { 
		    value = s;
		}
	};
	public enum ComptDig {
		A("Dominio de programas informáticos profesionales y redes sociales"),
		B("Tramites on-line de nivel avanzado"),
		C("Destreza en programas informáticos, APPs"),
		D("Acceso a información de interés, envio email"),
	    E("Manejo básico de ordenador");
		final private String value; 
		ComptDig(String s) { 
		    value = s;
		}
	};
	
	@Id 
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name ="id_cand")
	private int idcand;
	@Column(name ="carta_presentación")
	private String presentacion;
	@Column(name ="nombre")
	private String nombre;
	@Column(name ="apellido1")
	private String apellido1;
	@Column(name =" apellido2")
	private String apellidos2;
	@Column(name =" año_nacimiento")
	private String fchaNac;
	@Enumerated(EnumType.STRING)
	@Column(name ="sexo")
	private Sexo sexo;
	@Column(name ="localidad")
	private String localidad;
	@Column(name ="codigo_postal")
	private int codPostal;
	@Column(name ="provincia")
	private String provincia;
	@Enumerated(EnumType.STRING)
	@Column(name ="situacion_laboral") 
	private SituacionLaboral SituacionLaboral;
	@Enumerated(EnumType.STRING)
	@Column(name ="vehículo")
	private Vehiculo vehiculo; 
	@Enumerated(EnumType.STRING)
	@Column(name ="nacionalidad")
	private Nacionalidad nacionalidad;
	@Enumerated(EnumType.STRING)
	@Column(name ="permiso_trabajo")
	private Permiso permiso;
	@Enumerated(EnumType.STRING)
	@Column(name ="autonomo")
	private Autonomo autonomo;
	@Enumerated(EnumType.STRING)
	@Column(name ="compt_pers")
	private ComptPers comptPers;
	@Enumerated(EnumType.STRING)
	@Column(name ="compt_soc")
	private ComptSoc comptsoc;
	@Enumerated(EnumType.STRING)
	@Column(name ="compt_dig")
	private ComptDig comptdig;
	//ací caldrà posar un @OnetoOne y @JoinColumn
	@Column(name ="email")
	private String email;
	
	public Candidato() {
	}

	public Candidato(String presentacion, String nombre, String apellido1, String apellidos2,
			String fchaNac, Sexo sexo, String localidad, int codPostal, String provincia, SituacionLaboral situacionLaboral,
			Vehiculo vehiculo, Nacionalidad nacionalidad, Permiso permiso, Autonomo autonomo, ComptPers comptPers,
			ComptSoc comptsoc, ComptDig comptdig, String email) {
		super();
		this.presentacion = presentacion;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellidos2 = apellidos2;
		this.fchaNac = fchaNac;
		this.sexo = sexo;
		this.localidad = localidad;
		this.codPostal = codPostal;
		this.provincia = provincia;
		SituacionLaboral = situacionLaboral;
		this.vehiculo = vehiculo;
		this.nacionalidad = nacionalidad;
		this.permiso = permiso;
		this.autonomo = autonomo;
		this.comptPers = comptPers;
		this.comptsoc = comptsoc;
		this.comptdig = comptdig;
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getIdcand() {
		return idcand;
	}

	public void setIdcand(int idcand) {
		this.idcand = idcand;
	}

	public String getPresentacion() {
		return presentacion;
	}

	public void setPresentacion(String presentacion) {
		this.presentacion = presentacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellidos2() {
		return apellidos2;
	}

	public void setApellidos2(String apellidos2) {
		this.apellidos2 = apellidos2;
	}

	public String getFchaNac() {
		return fchaNac;
	}

	public void setFchaNac(String fchaNac) {
		this.fchaNac = fchaNac;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public int getCodPostal() {
		return codPostal;
	}

	public void setCodPostal(int codPostal) {
		this.codPostal = codPostal;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public SituacionLaboral getSituacionLaboral() {
		return SituacionLaboral;
	}

	public void setSituacionLaboral(SituacionLaboral situacionLaboral) {
		SituacionLaboral = situacionLaboral;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	public Nacionalidad getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(Nacionalidad nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public Permiso getPermiso() {
		return permiso;
	}

	public void setPermiso(Permiso permiso) {
		this.permiso = permiso;
	}

	public Autonomo getAutonomo() {
		return autonomo;
	}

	public void setAutonomo(Autonomo autonomo) {
		this.autonomo = autonomo;
	}

	public ComptPers getComptPers() {
		return comptPers;
	}

	public void setComptPers(ComptPers comptPers) {
		this.comptPers = comptPers;
	}

	public ComptSoc getComptsoc() {
		return comptsoc;
	}

	public void setComptsoc(ComptSoc comptsoc) {
		this.comptsoc = comptsoc;
	}

	public ComptDig getComptdig() {
		return comptdig;
	}

	public void setComptdig(ComptDig comptdig) {
		this.comptdig = comptdig;
	}
	
}
