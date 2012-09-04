package br.com.mackenzie.sgc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Table(name = "tbusuario")
@Entity
public class UsuarioModel {

	@Id
	private Long cdUsuario;
	@JoinColumn(name="cdDicionario")
	private Long tpUsuario;
	private String vrLogin;
	private String vrSenha;

	public Long getCdUsuario() {
		return cdUsuario;
	}

	public void setCdUsuario(Long cdUsuario) {
		this.cdUsuario = cdUsuario;
	}

	public Long getTpUsuario() {
		return tpUsuario;
	}

	public void setTpUsuario(Long tpUsuario) {
		this.tpUsuario = tpUsuario;
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

}
