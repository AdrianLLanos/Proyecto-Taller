package com.proytaller.Model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "escriben")
public class Escriben {
	@EmbeddedId
	private EscribenPK escriben_PK;
	@Column(name = "coda" , insertable = false, updatable = false)
	private int coda;
	@Column(name = "codt" , insertable = false, updatable = false)
	private int codt;

	public EscribenPK getEscriben_PK() {
		return escriben_PK;
	}

	public void setEscriben_PK(EscribenPK escriben_PK) {
		this.escriben_PK = escriben_PK;
	}

	public int getCoda() {
		return coda;
	}

	public void setCoda(int coda) {
		this.coda = coda;
	}

	public int getCodt() {
		return codt;
	}

	public void setCodt(int codt) {
		this.codt = codt;
	}

}
