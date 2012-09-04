package br.com.mackenzie.sgc.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.mackenzie.sgc.model.UsuarioModel;

public class UsuarioRepository {

	private EntityManager manager;

	public UsuarioRepository(EntityManager manager) {
		super();
		this.manager = manager;
	}

	public List<UsuarioModel> buscaTodas(){
		Query query = this.manager.createQuery("SELECT e FROM tbusuario e");
		return query.getResultList();
	}
}
