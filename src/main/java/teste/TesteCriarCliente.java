package teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entity.Cliente;

public class TesteCriarCliente {

	public static void main(String[] args) {

		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("full-stack");
		EntityManager em = fabrica.createEntityManager();

		// Criando um cliente
		Cliente cliente = new Cliente();
		cliente.setNome("Anderson");

		try {
			// Persistindo o cliente
			em.persist(cliente);
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