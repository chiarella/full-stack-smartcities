package br.com.JUnitTesteHERANCA;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import org.junit.jupiter.api.Test;

import br.com.entity5SINGLETABLE.Pessoa5;
import br.com.entity5SINGLETABLE.PessoaFisica5;
import br.com.entity5SINGLETABLE.PessoaJuridica5;

class TesteSINGLETABLE {

	@Test
	void test() {
		
		/*
		 * Funcionando
		 */

		EntityManager em = Persistence.createEntityManagerFactory("full-stack").createEntityManager();

		PessoaJuridica5 pj1 = new PessoaJuridica5();
		pj1.setCnpj("123.123.123/0001-00");
		pj1.setNome("Empresa de tecnologia");
		
		PessoaFisica5 pf1 = new PessoaFisica5();
		pf1.setCpf("123.123.123-00");
		pf1.setNome("Anderson Chiarella");		

		try {

			em.persist(pj1);
			em.persist(pf1);

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
