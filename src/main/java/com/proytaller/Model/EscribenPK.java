package com.proytaller.Model;

import java.io.Serializable;
import java.util.Objects;

public class EscribenPK implements Serializable {
	protected int coda;
	protected int codt;

	@Override
	public int hashCode() {
		return Objects.hash(coda, codt);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EscribenPK other = (EscribenPK) obj;
		return coda == other.coda && codt == other.codt;
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
