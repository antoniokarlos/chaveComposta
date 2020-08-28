package br.com.DuplaPk.DuplaPK.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class VersionamentoAPI {
	
	@EmbeddedId
	private VersionPK pks;
	
	private String mesReferencia;

	public VersionPK getPks() {
		return pks;
	}

	public void setPks(VersionPK pks) {
		this.pks = pks;
	}

	public String getMesReferencia() {
		return mesReferencia;
	}

	public void setMesReferencia(String mesReferencia) {
		this.mesReferencia = mesReferencia;
	}
	
	public VersionamentoAPI() {
		
	}
}
