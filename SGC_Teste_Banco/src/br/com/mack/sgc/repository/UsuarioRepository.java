package br.com.mack.sgc.repository;

import javax.persistence.EntityManager;
import br.com.mack.sgc.entidade.Usuario;

public class UsuarioRepository implements IUsuarioRepository {

	private EntityManager entity;

	public void setEntity(EntityManager entity) {
		this.entity = entity;
	}

	@Override
	public void inserir(Usuario usuario) {
		entity.persist(usuario);
	}

	public UsuarioRepository(EntityManager entity) {
		super();
		this.entity = entity;
	}

}
