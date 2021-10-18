package com.proytaller.Model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "textos")
public class Textos {
	@Id
	@Column(name="codt")
	private int codt;
	@Column(name="titulo")
	private String titulo;
	@Column(name="resumen")
	private String resumen;
	@Column(name="isbn")
	private String isbn;
	@Column(name="edicion")
	private int edicion;
	@Column(name="fechapun")
	private Date fechapub;
	@Column(name="coda")
	private int coda;

	public int getCodt() {
		return codt;
	}

	public void setCodt(int codt) {
		this.codt = codt;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getResumen() {
		return resumen;
	}

	public void setResumen(String resumen) {
		this.resumen = resumen;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getEdicion() {
		return edicion;
	}

	public void setEdicion(int edicion) {
		this.edicion = edicion;
	}

	public Date getFechapub() {
		return fechapub;
	}

	public void setFechapub(Date fechapub) {
		this.fechapub = fechapub;
	}

	public int getCoda() {
		return coda;
	}

	public void setCoda(int coda) {
		this.coda = coda;
	}

}
