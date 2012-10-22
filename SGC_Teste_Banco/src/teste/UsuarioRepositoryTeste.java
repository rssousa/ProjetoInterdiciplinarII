package teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.mack.sgc.entidade.Dicionario;
import br.com.mack.sgc.entidade.Usuario;
import br.com.mack.sgc.repository.DicionarioRepository;
import br.com.mack.sgc.repository.UsuarioRepository;

public class UsuarioRepositoryTeste {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("mack_base_curriculo-pu");
		
		EntityManager manager = factory.createEntityManager();
		
		System.out.println(manager.isOpen());
		
	
		DicionarioRepository dr = new DicionarioRepository(manager);
		
		UsuarioRepository ur = new UsuarioRepository(manager);
		
		Usuario usuario = new Usuario();
		
		usuario.setVrLogin("b");
		usuario.setVrSenha("B");
		usuario.setTipo(dr.buscaPorCdDicionario(13L));
		
		ur.inserir(usuario);
		
		manager.getTransaction().begin();
		manager.getTransaction().commit();

	}

}
