package br.com.mackenzie.sgc.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.mackenzie.sgc.model.DicionarioModel;
import br.com.mackenzie.sgc.model.UsuarioModel;

public class DicionarioRepository {
	private EntityManager manager;

	
	public DicionarioRepository(EntityManager manager) {
		super();
		this.manager = manager;
	}


	public List<DicionarioModel> buscaTodas() {
		Query query = this.manager.createQuery("SELECT e FROM tbdicionario e");
		return query.getResultList();
	}
}
