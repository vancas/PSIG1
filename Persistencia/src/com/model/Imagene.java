package com.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the imagenes database table.
 * 
 */
@Entity
@Table(name="imagenes")
@NamedQuery(name="Imagene.findAll", query="SELECT i FROM Imagene i")
public class Imagene implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_img")
	private Integer idImg;

	private Boolean destacada;

	private String ruta;

	//bi-directional many-to-one association to Inmueble
	@ManyToOne
	@JoinColumn(name="gid_inm")
	private Inmueble inmueble;

	public Imagene() {
	}

	public Integer getIdImg() {
		return this.idImg;
	}

	public void setIdImg(Integer idImg) {
		this.idImg = idImg;
	}

	public Boolean getDestacada() {
		return this.destacada;
	}

	public void setDestacada(Boolean destacada) {
		this.destacada = destacada;
	}

	public String getRuta() {
		return this.ruta;
	}

	public void setRuta(String ruta) {
		this.ruta = ruta;
	}

	public Inmueble getInmueble() {
		return this.inmueble;
	}

	public void setInmueble(Inmueble inmueble) {
		this.inmueble = inmueble;
	}

}