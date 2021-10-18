package com.proytaller.Model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Personas")
public class PersonasModel {
	@Id
	@Column(name = "codper")
	private int codper;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "ap")
	private String ap;
	@Column(name = "am")
	private String am;
	@Column(name = "genero")
	private String genero;
	@Column(name = "estado")
	private int estado;
	@Column(name = "tipoper")
	private String tipoper;
	@Column(name = "foto")
	private String foto;

	// relaciones
	@OneToMany(mappedBy = "personasmodel")
	private List<Telefonos> telefonos;
	@OneToOne(mappedBy = "personasmodel")
	private Datos datos;
	@OneToOne(mappedBy = "personasmodel")
	private Usuarios usuarios;

	public Usuarios getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(Usuarios usuarios) {
		this.usuarios = usuarios;
	}

	public Datos getDatos() {
		return datos;
	}

	public void setDatos(Datos datos) {
		this.datos = datos;
	}

	public List<Telefonos> getTelefonos() {
		return telefonos;
	}

	public void setTelefonos(List<Telefonos> telefonos) {
		this.telefonos = telefonos;
	}

	public int getCodper() {
		return codper;
	}

	public void setCodper(int codper) {
		this.codper = codper;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAp() {
		return ap;
	}

	public void setAp(String ap) {
		this.ap = ap;
	}

	public String getAm() {
		return am;
	}

	public void setAm(String am) {
		this.am = am;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public String getTipoper() {
		return tipoper;
	}

	public void setTipoper(String tipoper) {
		this.tipoper = tipoper;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

}
