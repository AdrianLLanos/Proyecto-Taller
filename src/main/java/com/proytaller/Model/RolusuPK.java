package com.proytaller.Model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;

@Embeddable
public class RolusuPK implements Serializable {
	protected int codr;
	protected String login;

	@Override
	public int hashCode() {
		return Objects.hash(codr, login);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RolusuPK other = (RolusuPK) obj;
		return codr == other.codr && Objects.equals(login, other.login);
	}

	public int getCodr() {
		return codr;
	}

	public void setCodr(int codr) {
		this.codr = codr;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

}
