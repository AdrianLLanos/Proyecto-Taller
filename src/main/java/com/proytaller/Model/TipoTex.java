package com.proytaller.Model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tipotex")
public class TipoTex {
	@EmbeddedId
	private TipoTexPK tipotex_ID;
	@Column(name = "codt", insertable = false, updatable = false)
	private int codt;
	@Column(name = "docum")
	private String docum;
	@Column(name = "codtipo", insertable = false, updatable = false)
	private int codtipo;

	public TipoTexPK getTipotex_ID() {
		return tipotex_ID;
	}

	public void setTipotex_ID(TipoTexPK tipotex_ID) {
		this.tipotex_ID = tipotex_ID;
	}

	public int getCodt() {
		return codt;
	}

	public void setCodt(int codt) {
		this.codt = codt;
	}

	public String getDocum() {
		return docum;
	}

	public void setDocum(String docum) {
		this.docum = docum;
	}

	public int getCodtipo() {
		return codtipo;
	}

	public void setCodtipo(int codtipo) {
		this.codtipo = codtipo;
	}

}
