package br.com.mack.sgc.entidade;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Usuario {

	@Id
	@GeneratedValue
	private Long cdUsuario;
	@Basic(optional = false)
	private String vrLogin;
	@Basic(optional = false)
	private String vrSenha;

	@ManyToOne
	@JoinColumn(name = "tpUsuario")
	private Dicionario tipo;

	public Long getCdUsuario() {
		return cdUsuario;
	}

	public void setCdUsuario(Long cdUsuario) {
		this.cdUsuario = cdUsuario;
	}

	public String getVrLogin() {
		return vrLogin;
	}

	public void setVrLogin(String vrLogin) {
		this.vrLogin = vrLogin;
	}

	public String getVrSenha() {
		return vrSenha;
	}

	public void setVrSenha(String vrSenha) {
		this.vrSenha = vrSenha;
	}

	public Dicionario getTipo() {
		return tipo;
	}

	public void setTipo(Dicionario tipo) {
		this.tipo = tipo;
	}
}
