package br.com.JUnitTeste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.Test;

import br.com.entity.Cliente;

class InsercaoClienteJUnit {

	@Test
	void test() {

		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("full-stack");
		EntityManager em = fabrica.createEntityManager();

		// Criando um cliente
		Cliente cliente = new Cliente();
		cliente.setNome("Angelo");

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
