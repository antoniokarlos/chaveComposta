package br.com.DuplaPk.DuplaPK.entities;

import java.util.Collection;
import java.util.List;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

@Entity
public class VersionamentoAPI {
	
	@EmbeddedId
	private VersionPK pks;
	
	private String mesReferencia;
	
	@OneToMany(mappedBy="versao")
	private List<TipoGarantias> garantias;

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

	public List<TipoGarantias> getGarantias() {
		return garantias;
	}

	public void setGarantias(List<TipoGarantias> garantias) {
		this.garantias = garantias;
	}
	
	
}
