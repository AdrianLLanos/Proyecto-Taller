package com.proytaller.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "datos")
public class Datos {
	@Id
	@Column(name = "ci")
	private int ci;
	@Column(name = "codper")
	private int codper;
	// relacion
	@OneToOne
	@JoinColumn(name = "codper", insertable = false, updatable = false)
	private PersonasModel personasmodel;

	public int getCi() {
		return ci;
	}

	public void setCi(int ci) {
		this.ci = ci;
	}

	public int getCodper() {
		return codper;
	}

	public void setCodper(int codper) {
		this.codper = codper;
	}

}
