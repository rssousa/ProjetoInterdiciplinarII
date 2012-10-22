package br.com.mack.sgc.repository;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import br.com.mack.sgc.entidade.Usuario;

@Stateless
@Local(IUsuarioRepository.class)
public class UsuarioRepository implements IUsuarioRepository{

	
	@PersistenceContext
	private EntityManager entity;
	
	@Override
	public void inserir(Usuario usuario) {
		entity.persist(usuario);
	}

}
