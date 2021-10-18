package com.proytaller.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mprestamo")
public class MPrestamo {
	@Id
	@Column(name = "codp")
	private int codp;
	@Column(name = "fecha")
	private String fecha;
	@Column(name = "fini")
	private String fini;
	@Column(name = "ffin")
	private String ffin;
	@Column(name = "tipopres")
	private int tipopres;
	@Column(name = "estado")
	private int estado;
	@Column(name = "ci")
	private int ci;
	@Column(name = "login")
	private String login;

	public int getCodp() {
		return codp;
	}

	public void setCodp(int codp) {
		this.codp = codp;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getFini() {
		return fini;
	}

	public void setFini(String fini) {
		this.fini = fini;
	}

	public String getFfin() {
		return ffin;
	}

	public void setFfin(String ffin) {
		this.ffin = ffin;
	}

	public int getTipopres() {
		return tipopres;
	}

	public void setTipopres(int tipopres) {
		this.tipopres = tipopres;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public int getCi() {
		return ci;
	}

	public void setCi(int ci) {
		this.ci = ci;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

}

