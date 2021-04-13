package testeJUnit;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.Test;

import entity.Cliente;

class RemocaoClienteJUnit {

	@Test
	void test() {
		// fail("Not yet implemented");

		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("full-stack");
		EntityManager em = fabrica.createEntityManager();

		//Buscando o cliente de ID:1 para a remoção
		Cliente cliente  = em.find(Cliente.class, 1);
		
		//Metodo para remoção
		em.remove(cliente);
			
		try {
		
			em.getTransaction().begin();
			em.getTransaction().commit();

		} catch (Exception e) {
			if (em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}

		}

		em.close();
		fabrica.close();

	}

}
