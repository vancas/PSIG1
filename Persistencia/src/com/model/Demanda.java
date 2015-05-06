package com.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the demanda database table.
 * 
 */
@Entity
@NamedQuery(name="Demanda.findAll", query="SELECT d FROM Demanda d")
public class Demanda implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_demanda")
	private Integer idDemanda;

	@Temporal(TemporalType.DATE)
	private Date fecha;

	//bi-directional many-to-one association to Zona
	@ManyToOne
	@JoinColumn(name="gidzona")
	private Zona zona;

	public Demanda() {
	}

	public Integer getIdDemanda() {
		return this.idDemanda;
	}

	public void setIdDemanda(Integer idDemanda) {
		this.idDemanda = idDemanda;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Zona getZona() {
		return this.zona;
	}

	public void setZona(Zona zona) {
		this.zona = zona;
	}

}