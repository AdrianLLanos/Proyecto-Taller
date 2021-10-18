package com.proytaller.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "usuarios")
public class Usuarios {
	@Id
	@Column(name = "login")
	private String login;
	@Column(name = "passwd")
	private String passwd;
	@Column(name = "estado")
	private int estado;
	@Column(name = "codper")
	private int codper;
	// relacion
	@OneToOne
	@JoinColumn(name = "codper", insertable = false, updatable = false)
	private PersonasModel personasmodel;

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public int getCodper() {
		return codper;
	}

	public void setCodper(int codper) {
		this.codper = codper;
	}

}
