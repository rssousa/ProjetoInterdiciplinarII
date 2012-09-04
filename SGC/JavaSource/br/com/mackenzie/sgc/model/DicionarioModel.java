package br.com.mackenzie.sgc.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "tbdicionario")
public class DicionarioModel {

	@Id
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

}
