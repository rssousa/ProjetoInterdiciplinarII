package br.com.mackenzie.sgc.mb;






import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import br.com.mackenzie.sgc.form.LoginForm;

@ManagedBean
public class LoginMB {

	private LoginForm loginForm;

	public LoginMB() {
		super();
		loginForm = new LoginForm();
	}

	public String logar() {

		System.out.println(loginForm);
		return "ind";
	}

	public LoginForm getLoginForm() {
		return loginForm;
	}

	public void setLoginForm(LoginForm loginForm) {
		this.loginForm = loginForm;
	}

}
