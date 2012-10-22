package br.com.mack.sgc.mb;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import br.com.mack.sgc.entidade.Dicionario;
import br.com.mack.sgc.entidade.Usuario;
import br.com.mack.sgc.repository.IDicionarioRepository;
import br.com.mack.sgc.repository.IUsuarioRepository;
import br.com.mack.sgc.view.CadastroUsuarioView;

@ManagedBean
public class CadastroUsuarioMB {

	
	private CadastroUsuarioView usuarioView;

	@EJB
	private IUsuarioRepository usuarioRepository;
	
	@EJB
	private IDicionarioRepository dicionarioRepository;
	
	public CadastroUsuarioMB() {
		super();
		usuarioView = new CadastroUsuarioView();
	}

	public String cadastrar(){
		
		if(usuarioView.getSenha().equalsIgnoreCase(usuarioView.getConfirmacaoSenha())){
			Usuario usuario = new Usuario();
			
			usuario.setVrLogin(usuarioView.getLogin());
			usuario.setVrSenha(usuarioView.getSenha());
			usuario.setTipo(dicionarioRepository.buscaPorCdDicionario(13L));
			
			usuarioRepository.inserir(usuario);
		}
		return null;
	}
	
	public CadastroUsuarioView getUsuario() {
		return usuarioView;
	}

	public void setUsuario(CadastroUsuarioView usuario) {
		this.usuarioView = usuario;
	}	
}
