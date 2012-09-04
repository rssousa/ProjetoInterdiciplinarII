package br.com.mackenzie.sgc.mb;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import br.com.mackenzie.sgc.form.LoginForm;

@ManagedBean
public class LoginMB {

	private LoginForm loginForm;

	public LoginMB() {
		super();
		loginForm = new LoginForm();
	}

	public String logar() {
		
		FacesContext fc = FacesContext.getCurrentInstance();

		if(loginForm.getVrLogin().equalsIgnoreCase("ADMIN") && loginForm.getVrSenha().equalsIgnoreCase("ADMIN")){
		    return "homeUsuario";
		}else{
			FacesMessage fm = new FacesMessage("usuário e/ou senha incorretos");
			//fm.setSeverity(FacesMessage.SEVERITY_ERROR);
			fc.addMessage("y:usuario", fm);
			return "home";
		}
	}

	public LoginForm getLoginForm() {
		return loginForm;
	}

	public void setLoginForm(LoginForm loginForm) {
		this.loginForm = loginForm;
	}

}
