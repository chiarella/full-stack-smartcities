package br.com.JUnitTeste;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import org.junit.jupiter.api.Test;

import br.com.entity.Cliente;
import br.com.entity.ContratoAluguel;
import br.com.entity.Estabelecimento;
import br.com.entity.TipoEstabelecimento;

class InsercaoEntidadesRelacionadasJUnit {

	@Test
	void test() {

		EntityManager em = Persistence.createEntityManagerFactory("full-stack").createEntityManager();

		TipoEstabelecimento tipo = new TipoEstabelecimento(0, "Petshop", null);

		// Criando clientes
		Cliente cliente1 = new Cliente(0, "Anderson Chiarella", null);
		Cliente cliente2 = new Cliente(0, "Aline Borges", null);

		ContratoAluguel contrato = new ContratoAluguel(1, 2000, new GregorianCalendar(2021, Calendar.JANUARY, 10),
				null);

		List<Cliente> lista = new ArrayList<>();
		lista.add(cliente1);
		lista.add(cliente2);

		// Criando estabelecimentos
		Estabelecimento est1 = new Estabelecimento(null, "Cão feliz", lista, null, tipo);
		Estabelecimento est2 = new Estabelecimento(null, "Dogão", lista, contrato, tipo);

		contrato.setEstabelecimento(est2);

		try {

			em.persist(est1);
			em.persist(est2);

			em.getTransaction().begin();
			em.getTransaction().commit();

		} catch (Exception e) {
			if (em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}

		}

		em.close();

	}

}
