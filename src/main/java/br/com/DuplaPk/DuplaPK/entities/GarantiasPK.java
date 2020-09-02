package br.com.DuplaPk.DuplaPK.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class GarantiasPK implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column
	private VersionPK pks; 
	
	@Column
	private Long tipoGarantia; 
	
	
	
	
	public GarantiasPK() {
		super();
	}


	public GarantiasPK(VersionPK pk, Long id) {
		this.pks = pk;
		this.tipoGarantia = id;
	}


	public VersionPK getPks() {
		return pks;
	}


	public void setPks(VersionPK pks) {
		this.pks = pks;
	}


	public Long getTipoGarantia() {
		return tipoGarantia;
	}


	public void setTipoGarantia(Long tipoGarantia) {
		this.tipoGarantia = tipoGarantia;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((pks == null) ? 0 : pks.hashCode());
		result = prime * result + ((tipoGarantia == null) ? 0 : tipoGarantia.hashCode());
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
		GarantiasPK other = (GarantiasPK) obj;
		if (pks == null) {
			if (other.pks != null)
				return false;
		} else if (!pks.equals(other.pks))
			return false;
		if (tipoGarantia == null) {
			if (other.tipoGarantia != null)
				return false;
		} else if (!tipoGarantia.equals(other.tipoGarantia))
			return false;
		return true;
	}
	
	
	
}
