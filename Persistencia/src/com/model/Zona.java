package com.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the zonas database table.
 * 
 */
@Entity
@Table(name="zonas")
@NamedQuery(name="Zona.findAll", query="SELECT z FROM Zona z")
public class Zona implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer gidzona;

	private String nombre;

	//bi-directional many-to-one association to Demanda
	@OneToMany(mappedBy="zona")
	private List<Demanda> demandas;

	//bi-directional many-to-one association to Inmueble
	@OneToMany(mappedBy="zona")
	private List<Inmueble> inmuebles;

	public Zona() {
	}

	public Integer getGidzona() {
		return this.gidzona;
	}

	public void setGidzona(Integer gidzona) {
		this.gidzona = gidzona;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Demanda> getDemandas() {
		return this.demandas;
	}

	public void setDemandas(List<Demanda> demandas) {
		this.demandas = demandas;
	}

	public Demanda addDemanda(Demanda demanda) {
		getDemandas().add(demanda);
		demanda.setZona(this);

		return demanda;
	}

	public Demanda removeDemanda(Demanda demanda) {
		getDemandas().remove(demanda);
		demanda.setZona(null);

		return demanda;
	}

	public List<Inmueble> getInmuebles() {
		return this.inmuebles;
	}

	public void setInmuebles(List<Inmueble> inmuebles) {
		this.inmuebles = inmuebles;
	}

	public Inmueble addInmueble(Inmueble inmueble) {
		getInmuebles().add(inmueble);
		inmueble.setZona(this);

		return inmueble;
	}

	public Inmueble removeInmueble(Inmueble inmueble) {
		getInmuebles().remove(inmueble);
		inmueble.setZona(null);

		return inmueble;
	}

}