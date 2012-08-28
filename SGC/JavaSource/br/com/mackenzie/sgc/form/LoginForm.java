package br.com.mackenzie.sgc.form;

public class LoginForm {

	private String vrLogin;
	private String vrSenha;

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

	@Override
	public String toString() {
		return "LoginForm [vrLogin=" + vrLogin + ", vrSenha=" + vrSenha + "]";
	}
}
