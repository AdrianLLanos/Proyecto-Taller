package com.proytaller.Model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "rolusu")
public class Rolusu {
	@EmbeddedId
	private RolusuPK rolusu_ID;
	@Column(name = "codr", insertable = false, updatable = false)
	private int codr;
	@Column(name = "login", insertable = false, updatable = false)
	private String login;

	public RolusuPK getRolusu_ID() {
		return rolusu_ID;
	}

	public void setRolusu_ID(RolusuPK rolusu_ID) {
		this.rolusu_ID = rolusu_ID;
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
