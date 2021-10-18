package com.proytaller.Model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "rolme")
public class Rolme {
	@EmbeddedId
	private RolmePK rolme_ID;
	@Column(name = "codr", insertable = false, updatable = false)
	private int codr;
	@Column(name = "codm", insertable = false, updatable = false)
	private int codm;

	public RolmePK getRolme_ID() {
		return rolme_ID;
	}

	public void setRolme_ID(RolmePK rolme_ID) {
		this.rolme_ID = rolme_ID;
	}

	public int getCodr() {
		return codr;
	}

	public void setCodr(int codr) {
		this.codr = codr;
	}

	public int getCodm() {
		return codm;
	}

	public void setCodm(int codm) {
		this.codm = codm;
	}

}
