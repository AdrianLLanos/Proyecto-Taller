package com.proytaller.Model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "dprestamo")
public class DPrestamo {
	@EmbeddedId
	private DPrestamoPK DPrestamo_ID;
	@Column(name = "codp", insertable = false, updatable = false)
	private int codp;
	@Column(name = "codinv", insertable = false, updatable = false)
	private int codinv;
	@Column(name = "estado")
	private int estado;

	public DPrestamoPK getDPrestamo_ID() {
		return DPrestamo_ID;
	}

	public void setDPrestamo_ID(DPrestamoPK dPrestamo_ID) {
		DPrestamo_ID = dPrestamo_ID;
	}

	public int getCodp() {
		return codp;
	}

	public void setCodp(int codp) {
		this.codp = codp;
	}

	public int getCodinv() {
		return codinv;
	}

	public void setCodinv(int codinv) {
		this.codinv = codinv;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

}
