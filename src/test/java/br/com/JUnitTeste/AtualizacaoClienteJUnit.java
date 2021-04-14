package br.com.JUnitTeste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.Test;

import br.com.entity.Cliente;

class AtualizacaoClienteJUnit {

	@Test
	void test() {
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("full-stack");
		EntityManager em = fabrica.createEntityManager();

		Cliente cliente = em.find(Cliente.class, 2);
		
		System.out.println("");
		System.out.println("");
		System.out.println("ID do cliente:" + cliente.getId() + " Nome do cliente: " + cliente.getNome());
		System.out.println("");
		System.out.println("");	
		
		cliente.setNome("Angelo Chiarella");
		
		em.getTransaction().begin();
		em.getTransaction().commit();
		
		
		System.out.println("");
		System.out.println("");
		System.out.println("ID do cliente:" + cliente.getId() + " Nome do cliente: " + cliente.getNome());
		System.out.println("");
		System.out.println("");	
				
		em.close();
		fabrica.close();
	}

}
