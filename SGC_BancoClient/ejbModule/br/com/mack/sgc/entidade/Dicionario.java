package br.com.mack.sgc.entidade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Dicionario {

	@Id
	@GeneratedValue
	private Long cdDicionario;
	private String nmDicionario;
	private String dsDicionario;

	public Long getCdDicionario() {
		return cdDicionario;
	}

	public void setCdDicionario(Long cdDicionario) {
		this.cdDicionario = cdDicionario;
	}

	public String getNmDicionario() {
		return nmDicionario;
	}

	public void setNmDicionario(String nmDicionario) {
		this.nmDicionario = nmDicionario;
	}

	public String getDsDicionario() {
		return dsDicionario;
	}

	public void setDsDicionario(String dsDicionario) {
		this.dsDicionario = dsDicionario;
	}

	@Override
	public String toString() {
		return "Dicionario [cdDicionario=" + cdDicionario + ", nmDicionario="
				+ nmDicionario + ", dsDicionario=" + dsDicionario + "]";
	}

}
