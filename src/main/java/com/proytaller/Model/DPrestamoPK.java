package com.proytaller.Model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;
@Embeddable
public class DPrestamoPK implements Serializable {
	protected int codp;
	protected int codinv;

	@Override
	public int hashCode() {
		return Objects.hash(codinv, codp);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DPrestamoPK other = (DPrestamoPK) obj;
		return codinv == other.codinv && codp == other.codp;
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

}
