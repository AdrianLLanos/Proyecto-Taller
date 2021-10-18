package com.proytaller.Model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;

@Embeddable
public class TelefonosPK implements Serializable {
	protected int codper;
	protected String numero;

	@Override
	public int hashCode() {
		return Objects.hash(codper, numero);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TelefonosPK other = (TelefonosPK) obj;
		return codper == other.codper && Objects.equals(numero, other.numero);
	}

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
