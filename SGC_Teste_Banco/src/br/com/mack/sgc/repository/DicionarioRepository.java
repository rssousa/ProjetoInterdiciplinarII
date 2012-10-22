package br.com.mack.sgc.repository;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import br.com.mack.sgc.entidade.Dicionario;
import br.com.mack.sgc.repository.IDicionarioRepository;



public class DicionarioRepository implements IDicionarioRepository{


	private EntityManager entity;
	

	public DicionarioRepository(EntityManager entity){
		super();
		this.entity=entity;
	}
	
	@Override
	public List<Dicionario> buscaPorDescricacao(String descricao) {
		
		Query query = entity.createQuery("SELECT d FROM Dicionario d WHERE d.dsDicionario = ?");
		query.setParameter(1, descricao);
		
		return query.getResultList();
	}


	@Override
	public Dicionario buscaPorCdDicionario(Long cdDicionario) {
		// TODO Auto-generated method stub
		return entity.find(Dicionario.class, cdDicionario);
	}

}
