package com.proytaller.Model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity
@Table(name = "telefonos")
public class Telefonos {
	@EmbeddedId
	private TelefonosPK telefonos_ID;
	@Column(name = "codper", insertable = false, updatable = false)
	private int codper;
	@Column(name = "numero", insertable = false, updatable = false)
	private String numero;

	public TelefonosPK getTelefonos_ID() {
		return telefonos_ID;
	}

	public void setTelefonos_ID(TelefonosPK telefonos_ID) {
		this.telefonos_ID = telefonos_ID;
	}

	// Relacion
	@ManyToOne
	@MapsId("codper")
	@JoinColumn(name = "codper", insertable = false, updatable = false)
	private PersonasModel personasmodel;
	

	
	

	public int getCodper() {
		return codper;
	}

	public void setCodper(int codper) {
		this.codper = codper;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

}
