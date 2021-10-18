package com.proytaller.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tipos")
public class Tipos {
	@Id
	@Column(name = "codtipo")
	private int codtipo;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "estado")
	private int estado;
	@Column(name = "sw")
	private int sw;

	public int getCodtipo() {
		return codtipo;
	}

	public void setCodtipo(int codtipo) {
		this.codtipo = codtipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public int getSw() {
		return sw;
	}

	public void setSw(int sw) {
		this.sw = sw;
	}

}
