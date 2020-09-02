package br.com.DuplaPk.DuplaPK.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

@Entity
public class TipoGarantias {

	@EmbeddedId
	private GarantiasPK pks;
	
	private String nomeGarantia;

	public String getNomeGarantia() {
		return nomeGarantia;
	}

	public void setNomeGarantia(String nomeGarantia) {
		this.nomeGarantia = nomeGarantia;
	}
	
	
	@MapsId("versionPK")
    @JoinColumns({
        @JoinColumn(name="dataVersao", referencedColumnName="dataVersao"),
        @JoinColumn(name="codVersionamento", referencedColumnName="codVersionamento")
    })
	@ManyToOne
	private VersionamentoAPI versao;

	public GarantiasPK getPks() {
		return pks;
	}

	public void setPks(GarantiasPK pks) {
		this.pks = pks;
	}

	/*public VersionamentoAPI getVersao() {
		return versao;
	}

	public void setVersao(VersionamentoAPI versao) {
		this.versao = versao;
	}*/

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((pks == null) ? 0 : pks.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TipoGarantias other = (TipoGarantias) obj;
		if (pks == null) {
			if (other.pks != null)
				return false;
		} else if (!pks.equals(other.pks))
			return false;
		return true;
	}

	public VersionamentoAPI getVersao() {
		return versao;
	}

	public void setVersao(VersionamentoAPI versao) {
		this.versao = versao;
	}
	
	
}
