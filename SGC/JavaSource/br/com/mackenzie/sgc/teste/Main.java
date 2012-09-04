package br.com.mackenzie.sgc.teste;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import br.com.mackenzie.sgc.model.DicionarioModel;
import br.com.mackenzie.sgc.model.UsuarioModel;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("mack_base_curriculo-pu");

		EntityManager manager = factory.createEntityManager();

		Query query = manager.createQuery("select e from DicionarioModel e");

		List<DicionarioModel> usuarios = query.getResultList();

		for (DicionarioModel u : usuarios) {
			System.out.println(u.getDsDicionario());
		}

	}

}
