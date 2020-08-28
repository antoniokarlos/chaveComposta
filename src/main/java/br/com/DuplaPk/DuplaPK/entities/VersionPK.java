package br.com.DuplaPk.DuplaPK.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class VersionPK implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column
	private Date dataVersao;
	@Column
	private String codVersionamento;
	
	public Date getDataVersao() {
		return dataVersao;
	}
	public void setDataVersao(Date dataVersao) {
		this.dataVersao = dataVersao;
	}
	public String getCodVersionamento() {
		return codVersionamento;
	}
	public void setCodVersionamento(String codVersionamento) {
		this.codVersionamento = codVersionamento;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codVersionamento == null) ? 0 : codVersionamento.hashCode());
		result = prime * result + ((dataVersao == null) ? 0 : dataVersao.hashCode());
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
		VersionPK other = (VersionPK) obj;
		if (codVersionamento == null) {
			if (other.codVersionamento != null)
				return false;
		} else if (!codVersionamento.equals(other.codVersionamento))
			return false;
		if (dataVersao == null) {
			if (other.dataVersao != null)
				return false;
		} else if (!dataVersao.equals(other.dataVersao))
			return false;
		return true;
	}
	
	
	
	
}
