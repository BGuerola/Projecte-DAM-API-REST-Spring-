package com.justaproject.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="OFERTA_TRABAJO")
public class OfertaTrabajo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public enum Sector{
		A("1.Agraria"), 
		B("2.Marítimo-Pesquera"), 
		C("3.Industrias Alimentarias"), 
		D("4.Química"), 
	    E("5. Imagen Personal"), 
	    F("6. Sanidad"), 
	    G("7. Seguridad y Medio Ambiente"), 
	    H("8. Fabricación Mecánica"), 
	    I("9. Instalación y Mantenimiento"),
	    J("10. Electricidad y Electrónica"), 
	    K("11. Energía y Agua"),
	    L("12. Transporte y Mantenimiento de Vehículos"),
	    M("13. Industrias Extractivas"), 
	    N("14. Edificación y Obra Civil"),
	    O("15. Vidrio y Cerámica"),
	    P("16. Madera, Mueble y Corcho"), 
	    Q("17. Textil, Confección y Piel"),
	    R("18. Artes Gráficas"),
	    S("19. Imagen y Sonido"), 
	    T("20. Informática y Comunicaciones"),
	    U("21. Administración y Gestión"), 
	    V("22. Comercio y Marketing"),
	    W("23. Servicios Socioculturales y a la Comunidad"), 
	    X("24. Hostelería y Turismo"),
	    Y("25. Actividades Físicas y Deportivas"),
	    Z("26. Artes y Artesanías");
		  final private String value; 
		  Sector(String s) { 
		    value = s;
		  }
	};
	public enum Cat{
		A("Administrativo"), 
		B("Administrativo de empresa"), 
		C("Atención al cliente"), 
		D("Calidad, producción e I+D"), 
		E("Comercial y ventas"),
	    F("Compras, logística y almacén"), 
	    G("Diseño y artes gráficas"), 
	    H("Educación y formación"), 
	    I("Finanzas y bancos"), 
	    J("Informática y telecomunicaciones"),
	    K("Ingenieros y técnicos"), 
	    L("mantenimiento electromecánico y general"), 
	    M("Legal"), 
	    N("Marketing y Comunicación"), 
	    O("Profesiones, artes y oficios"), 
	    P("Recursos Humanos"), 
	    Q("PRL y Salud"), 
	    R("Farmacia y laboratorio"), 
	    S("Turismo y restauración"), 
	    T("Venta al detalle");
		  final private String value; 
		  Cat(String s) { 
		    value = s;
		  }
	};
	public enum Niv{
		A("1 Ingenieros y Licenciados"),
		B("2 Ingenieros Técnicos, Peritos y Ayudantes Titulados"),
	    C("3 Jefes Administrativos y de Taller"),
	    D("4 Ayudantes no Titulados"),
	    E("5 Oficiales Administrativos"),
	    F("6 Subalternos"),
	    G("7 Auxiliares Administrativos"),
	    H("8 Oficiales de primera y segunda"),
	    I("9 Oficiales de tercera y Especialistas"),
	    J("10 Peones"),
	    K("11 Trabajadores < 18 años");
		  final private String value; 
		  Niv(String s) { 
		    value = s;
		  }
	};
		  
		public enum tipoSal {
			BA ("Bruto año"), 
			BM ("Bruto mes"), 
			BD ("Bruto día");
			  final private String value; 
				  tipoSal(String s) { 
				    value = s;
				  }
			};
		  @Id
		  @GeneratedValue(strategy= GenerationType.IDENTITY)
		  @Column(name="id_ofertatreball")
		  private int idOfertaTreb;
		  @Column(name="publicada")
		  private String publicada;
		  @Column(name="nomPuesto")
		  private String nomPuesto; 
		  @Column(name="experiencia")
		  private String experiencia;
		  @Column(name="requisitos")
		  private String requisitos;
		  @Column(name="estudios_mínimos")
		  private String estudios;
		  @Column(name="residencia_en")
		  private String residencia;
		  @Column(name="Conoc_necesarios")
		  private String conocimientos;
		  @Column(name="funciones")
		  private String funciones;
		  @Column(name="personal_a_cargo")
		  private int paxacargo;
		  @Column (name="vacantes")
		  private int nvacantes;
		  @Column(name="duración_contrato")
		  private String durCont;
		  @Column(name="horario")
		  private String horario;
		  @Column(name="sector")
		  private Sector sector;
		  @Column(name="Categoría")
		  private Cat categoria;
		  @Column(name="Nivel")
		  private Niv nivel;
		  @Column(name="tipo_salario")
		  private tipoSal tiposal;
		  @Column(name="max_salario")
		  private int maxSal;
		  @Column(name="min_salario")
		  private int minSal;
		  @Column(name="beneficios_sociales")
		  private String benefSoc;
		  //ací caldrà posar un @OnetoOne y @JoinColumn
		  @Column(name="CIF")
		  private String CIF;
		
		  public OfertaTrabajo() {
			
		}

		public OfertaTrabajo(int idOfertaTreb, String publicada, String nomPuesto, String experiencia,
				String requisitos, String estudios, String residencia, String conocimientos, String funciones,
				int paxacargo, int nvacantes, String durCont, String horario, Sector sector, Cat categoria, Niv nivel,
				tipoSal tiposal, int maxSal, int minSal, String benefSoc, String cIF) {
			super();
			this.idOfertaTreb = idOfertaTreb;
			this.publicada = publicada;
			this.nomPuesto = nomPuesto;
			this.experiencia = experiencia;
			this.requisitos = requisitos;
			this.estudios = estudios;
			this.residencia = residencia;
			this.conocimientos = conocimientos;
			this.funciones = funciones;
			this.paxacargo = paxacargo;
			this.nvacantes = nvacantes;
			this.durCont = durCont;
			this.horario = horario;
			this.sector = sector;
			this.categoria = categoria;
			this.nivel = nivel;
			this.tiposal = tiposal;
			this.maxSal = maxSal;
			this.minSal = minSal;
			this.benefSoc = benefSoc;
			CIF = cIF;
		}

		public int getIdOfertaTreb() {
			return idOfertaTreb;
		}

		public void setIdOfertaTreb(int idOfertaTreb) {
			this.idOfertaTreb = idOfertaTreb;
		}

		public String getPublicada() {
			return publicada;
		}

		public void setPublicada(String publicada) {
			this.publicada = publicada;
		}

		public String getNomPuesto() {
			return nomPuesto;
		}

		public void setNomPuesto(String nomPuesto) {
			this.nomPuesto = nomPuesto;
		}

		public String getExperiencia() {
			return experiencia;
		}

		public void setExperiencia(String experiencia) {
			this.experiencia = experiencia;
		}

		public String getRequisitos() {
			return requisitos;
		}

		public void setRequisitos(String requisitos) {
			this.requisitos = requisitos;
		}

		public String getEstudios() {
			return estudios;
		}

		public void setEstudios(String estudios) {
			this.estudios = estudios;
		}

		public String getResidencia() {
			return residencia;
		}

		public void setResidencia(String residencia) {
			this.residencia = residencia;
		}

		public String getConocimientos() {
			return conocimientos;
		}

		public void setConocimientos(String conocimientos) {
			this.conocimientos = conocimientos;
		}

		public String getFunciones() {
			return funciones;
		}

		public void setFunciones(String funciones) {
			this.funciones = funciones;
		}

		public int getPaxacargo() {
			return paxacargo;
		}

		public void setPaxacargo(int paxacargo) {
			this.paxacargo = paxacargo;
		}

		public int getNvacantes() {
			return nvacantes;
		}

		public void setNvacantes(int nvacantes) {
			this.nvacantes = nvacantes;
		}

		public String getDurCont() {
			return durCont;
		}

		public void setDurCont(String durCont) {
			this.durCont = durCont;
		}

		public String getHorario() {
			return horario;
		}

		public void setHorario(String horario) {
			this.horario = horario;
		}

		public Sector getSector() {
			return sector;
		}

		public void setSector(Sector sector) {
			this.sector = sector;
		}

		public Cat getCategoria() {
			return categoria;
		}

		public void setCategoria(Cat categoria) {
			this.categoria = categoria;
		}

		public Niv getNivel() {
			return nivel;
		}

		public void setNivel(Niv nivel) {
			this.nivel = nivel;
		}

		public tipoSal getTiposal() {
			return tiposal;
		}

		public void setTiposal(tipoSal tiposal) {
			this.tiposal = tiposal;
		}

		public int getMaxSal() {
			return maxSal;
		}

		public void setMaxSal(int maxSal) {
			this.maxSal = maxSal;
		}

		public int getMinSal() {
			return minSal;
		}

		public void setMinSal(int minSal) {
			this.minSal = minSal;
		}

		public String getBenefSoc() {
			return benefSoc;
		}

		public void setBenefSoc(String benefSoc) {
			this.benefSoc = benefSoc;
		}

		public String getCIF() {
			return CIF;
		}

		public void setCIF(String cIF) {
			CIF = cIF;
		}
		  
		
		  
		  

		  

}

