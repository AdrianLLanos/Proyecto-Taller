package com.proytaller.Model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;



@Embeddable
public class DDevolPK implements Serializable {
	protected int codd;
	protected int codinv;

	@Override
	public int hashCode() {
		return Objects.hash(codd, codinv);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DDevolPK other = (DDevolPK) obj;
		return codd == other.codd && codinv == other.codinv;
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
