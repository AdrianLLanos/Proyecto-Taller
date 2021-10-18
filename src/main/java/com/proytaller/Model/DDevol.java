package com.proytaller.Model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ddevol")
public class DDevol {
	@EmbeddedId
	private DDevolPK ddevol_ID;
	@Column(name = "codd", insertable = false, updatable = false)
	private int codd;
	@Column(name = "codinv", insertable = false, updatable = false)
	private int codinv;

	public DDevolPK getDdevol_ID() {
		return ddevol_ID;
	}

	public void setDdevol_ID(DDevolPK ddevol_ID) {
		this.ddevol_ID = ddevol_ID;
	}

	public int getCodd() {
		return codd;
	}

	public void setCodd(int codd) {
		this.codd = codd;
	}

	public int getCodinv() {
		return codinv;
	}

	public void setCodinv(int codinv) {
		this.codinv = codinv;
	}

}
