package br.com.mack.sgc.mb;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import br.com.mack.sgc.view.LoginView;


@ManagedBean
public class LoginMB {

    private LoginView login;

	public LoginMB() {
		super();
		login = new LoginView();
	}

	public String logar() {
		
		FacesContext fc = FacesContext.getCurrentInstance();

		if(login.getVrLogin().equalsIgnoreCase("ADMIN") && login.getVrSenha().equalsIgnoreCase("ADMIN")){
		    return "homeUsuario";
		}else{
			FacesMessage fm = new FacesMessage("usuário e/ou senha incorretos");
			//fm.setSeverity(FacesMessage.SEVERITY_ERROR);
			fc.addMessage("id_login_formulario:usuario", fm);
			return "home";
		}
	}

	public LoginView getLogin() {
		return login;
	}

	public void setLogin(LoginView login) {
		this.login = login;
	}

}
