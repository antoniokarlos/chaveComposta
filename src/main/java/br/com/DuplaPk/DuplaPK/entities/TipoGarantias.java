package br.com.DuplaPk.DuplaPK.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class TipoGarantias {

	@Id
	private Long tipoGarantia;
	
	private String nomeGarantia;

	public Long getTipoGarantia() {
		return tipoGarantia;
	}

	public void setTipoGarantia(Long tipoGarantia) {
		this.tipoGarantia = tipoGarantia;
	}

	public String getNomeGarantia() {
		return nomeGarantia;
	}

	public void setNomeGarantia(String nomeGarantia) {
		this.nomeGarantia = nomeGarantia;
	}
	
	@ManyToOne(fetch = FetchType.EAGER)
	private VersionamentoAPI versionamento;

	public VersionamentoAPI getVersionamento() {
		return versionamento;
	}

	public void setVersionamento(VersionamentoAPI versionamento) {
		this.versionamento = versionamento;
	}
	
	
	
}
