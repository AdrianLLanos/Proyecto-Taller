package com.proytaller.Model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "mepro")
public class Mepro {
	@EmbeddedId
	private MeproPK mepro_ID;
	@Column(name = "codm", insertable = false, updatable = false)
	private int codm;
	@Column(name = "codp", insertable = false, updatable = false)
	private int codp;

	public MeproPK getMepro_ID() {
		return mepro_ID;
	}

	public void setMepro_ID(MeproPK mepro_ID) {
		this.mepro_ID = mepro_ID;
	}

	public int getCodm() {
		return codm;
	}

	public void setCodm(int codm) {
		this.codm = codm;
	}

	public int getCodp() {
		return codp;
	}

	public void setCodp(int codp) {
		this.codp = codp;
	}

}
