package com.proytaller.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ejemplares")
public class Ejemplares {
	@Id
	@Column(name = "codinv")
	private int codinv;
	@Column(name = "disponible")
	private int disponible;
	@Column(name = "codt")
	private int codt;
	@Column(name = "per_resp")
	private String per_resp;
	@Column(name = "per_anula")
	private String per_anula;

	public String getPer_resp() {
		return per_resp;
	}

	public void setPer_resp(String per_resp) {
		this.per_resp = per_resp;
	}

	public String getPer_anula() {
		return per_anula;
	}

	public void setPer_anula(String per_anula) {
		this.per_anula = per_anula;
	}

	public int getCodinv() {
		return codinv;
	}

	public void setCodinv(int codinv) {
		this.codinv = codinv;
	}

	public int getDisponible() {
		return disponible;
	}

	public void setDisponible(int disponible) {
		this.disponible = disponible;
	}

	public int getCodt() {
		return codt;
	}

	public void setCodt(int codt) {
		this.codt = codt;
	}

}
