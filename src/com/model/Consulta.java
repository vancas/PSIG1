package com.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the consulta database table.
 * 
 */
@Entity
@NamedQuery(name="Consulta.findAll", query="SELECT c FROM Consulta c")
public class Consulta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_consulta")
	private Integer idConsulta;

	private String apellido;

	private String descripcion;

	private String email;

	private String nombre;

	private Integer telefono;

	//bi-directional many-to-one association to Inmueble
	@ManyToOne
	@JoinColumn(name="gid_inm")
	private Inmueble inmueble;

	public Consulta() {
	}

	public Integer getIdConsulta() {
		return this.idConsulta;
	}

	public void setIdConsulta(Integer idConsulta) {
		this.idConsulta = idConsulta;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
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

	public Inmueble getInmueble() {
		return this.inmueble;
	}

	public void setInmueble(Inmueble inmueble) {
		this.inmueble = inmueble;
	}

}