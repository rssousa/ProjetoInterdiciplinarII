package br.com.mack.sgc.repository;

import java.util.List;

import br.com.mack.sgc.entidade.*;

public interface IDicionarioRepository {

	
	public List<Dicionario> buscaPorDescricacao(String descricao);
	
	public Dicionario buscaPorCdDicionario(Long cdDicionario);
}
