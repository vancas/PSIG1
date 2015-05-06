package com.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the propietario database table.
 * 
 */
@Entity
@NamedQuery(name="Propietario.findAll", query="SELECT p FROM Propietario p")
public class Propietario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_propietario")
	private Integer idPropietario;

	private String apellido;

	private Integer ci;

	private String email;

	private String nombre;

	private Integer telefono;

	//bi-directional many-to-one association to Inmueble
	@OneToMany(mappedBy="propietario")
	private List<Inmueble> inmuebles;

	public Propietario() {
	}

	public Integer getIdPropietario() {
		return this.idPropietario;
	}

	public void setIdPropietario(Integer idPropietario) {
		this.idPropietario = idPropietario;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Integer getCi() {
		return this.ci;
	}

	public void setCi(Integer ci) {
		this.ci = ci;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getTelefono() {
		return this.telefono;
	}

	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}

	public List<Inmueble> getInmuebles() {
		return this.inmuebles;
	}

	public void setInmuebles(List<Inmueble> inmuebles) {
		this.inmuebles = inmuebles;
	}

	public Inmueble addInmueble(Inmueble inmueble) {
		getInmuebles().add(inmueble);
		inmueble.setPropietario(this);

		return inmueble;
	}

	public Inmueble removeInmueble(Inmueble inmueble) {
		getInmuebles().remove(inmueble);
		inmueble.setPropietario(null);

		return inmueble;
	}

}