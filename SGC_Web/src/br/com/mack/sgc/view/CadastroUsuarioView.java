package br.com.mack.sgc.view;

public class CadastroUsuarioView {

	private String login;
	private String senha;
	private String confirmacaoSenha;
	private Long tpUsuario;

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getConfirmacaoSenha() {
		return confirmacaoSenha;
	}

	public void setConfirmacaoSenha(String confirmacaoSenha) {
		this.confirmacaoSenha = confirmacaoSenha;
	}

	public Long getTpUsuario() {
		return tpUsuario;
	}

	public void setTpUsuario(Long tpUsuario) {
		this.tpUsuario = tpUsuario;
	}

}
