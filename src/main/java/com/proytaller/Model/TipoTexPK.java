package com.proytaller.Model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;

@Embeddable
public class TipoTexPK implements Serializable {
	protected int codt;
	protected int codtipo;

	@Override
	public int hashCode() {
		return Objects.hash(codt, codtipo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TipoTexPK other = (TipoTexPK) obj;
		return codt == other.codt && codtipo == other.codtipo;
	}

	public int getCodt() {
		return codt;
	}

	public void setCodt(int codt) {
		this.codt = codt;
	}

	public int getCodtipo() {
		return codtipo;
	}

	public void setCodtipo(int codtipo) {
		this.codtipo = codtipo;
	}

}

