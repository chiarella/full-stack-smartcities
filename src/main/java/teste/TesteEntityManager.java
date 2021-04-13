package teste;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entity.Cliente;

public class TesteEntityManager {

	public static void main(String[] args) {

		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("full-stack");
		EntityManager em = fabrica.createEntityManager();



		em.close();
		fabrica.close();
	}

}
