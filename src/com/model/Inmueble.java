package com.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the inmueble database table.
 * 
 */
@Entity
@NamedQuery(name="Inmueble.findAll", query="SELECT i FROM Inmueble i")
public class Inmueble implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="gid_inm")
	private Integer gidInm;

	private Integer banios;

	private String descripcion;

	private String direccion;

	private String estado;

	private Boolean garage;

	private Integer habitaciones;

	private Boolean jardin;

	private Integer padron;

	private Integer pisos;

	private String proposito;

	private Integer tipo;

	private String titulo;

	private double valormax;

	private double valormin;

	//bi-directional many-to-one association to Consulta
	@OneToMany(mappedBy="inmueble")
	private List<Consulta> consultas;

	//bi-directional many-to-one association to Imagene
	@OneToMany(mappedBy="inmueble")
	private List<Imagene> imagenes;

	//bi-directional many-to-one association to Administrador
	@ManyToOne
	@JoinColumn(name="id_admin")
	private Administrador administrador;

	//bi-directional many-to-one association to Propietario
	@ManyToOne
	@JoinColumn(name="id_propietario")
	private Propietario propietario;

	//bi-directional many-to-one association to Zona
	@ManyToOne
	@JoinColumn(name="gidzona")
	private Zona zona;

	public Inmueble() {
	}

	public Integer getGidInm() {
		return this.gidInm;
	}

	public void setGidInm(Integer gidInm) {
		this.gidInm = gidInm;
	}

	public Integer getBanios() {
		return this.banios;
	}

	public void setBanios(Integer banios) {
		this.banios = banios;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Boolean getGarage() {
		return this.garage;
	}

	public void setGarage(Boolean garage) {
		this.garage = garage;
	}

	public Integer getHabitaciones() {
		return this.habitaciones;
	}

	public void setHabitaciones(Integer habitaciones) {
		this.habitaciones = habitaciones;
	}

	public Boolean getJardin() {
		return this.jardin;
	}

	public void setJardin(Boolean jardin) {
		this.jardin = jardin;
	}

	public Integer getPadron() {
		return this.padron;
	}

	public void setPadron(Integer padron) {
		this.padron = padron;
	}

	public Integer getPisos() {
		return this.pisos;
	}

	public void setPisos(Integer pisos) {
		this.pisos = pisos;
	}

	public String getProposito() {
		return this.proposito;
	}

	public void setProposito(String proposito) {
		this.proposito = proposito;
	}

	public Integer getTipo() {
		return this.tipo;
	}

	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}

	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getValormax() {
		return this.valormax;
	}

	public void setValormax(double valormax) {
		this.valormax = valormax;
	}

	public double getValormin() {
		return this.valormin;
	}

	public void setValormin(double valormin) {
		this.valormin = valormin;
	}

	public List<Consulta> getConsultas() {
		return this.consultas;
	}

	public void setConsultas(List<Consulta> consultas) {
		this.consultas = consultas;
	}

	public Consulta addConsulta(Consulta consulta) {
		getConsultas().add(consulta);
		consulta.setInmueble(this);

		return consulta;
	}

	public Consulta removeConsulta(Consulta consulta) {
		getConsultas().remove(consulta);
		consulta.setInmueble(null);

		return consulta;
	}

	public List<Imagene> getImagenes() {
		return this.imagenes;
	}

	public void setImagenes(List<Imagene> imagenes) {
		this.imagenes = imagenes;
	}

	public Imagene addImagene(Imagene imagene) {
		getImagenes().add(imagene);
		imagene.setInmueble(this);

		return imagene;
	}

	public Imagene removeImagene(Imagene imagene) {
		getImagenes().remove(imagene);
		imagene.setInmueble(null);

		return imagene;
	}

	public Administrador getAdministrador() {
		return this.administrador;
	}

	public void setAdministrador(Administrador administrador) {
		this.administrador = administrador;
	}

	public Propietario getPropietario() {
		return this.propietario;
	}

	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}

	public Zona getZona() {
		return this.zona;
	}

	public void setZona(Zona zona) {
		this.zona = zona;
	}

}