package br.com.JUnitTesteHERANCA;

import static org.junit.jupiter.api.Assertions.*;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import org.junit.jupiter.api.Test;

import br.com.entity4TABLEPERCLASS.Pessoa4;
import br.com.entity4TABLEPERCLASS.PessoaJuridica4;
import br.com.entity5SINGLETABLE.PessoaFisica5;
import br.com.entity5SINGLETABLE.PessoaJuridica5;

class TesteTABLEPERCLASS {

	@Test
	void test() {
		
		/*
		 * Efetuar teste e continuar desenvolvimento
		 */

		
		EntityManager em = Persistence.createEntityManagerFactory("full-stack").createEntityManager();

		Pessoa4 ps4 = new Pessoa4();
		ps4.setNome("TESTE");
		
		
		PessoaJuridica4 pj1 = new PessoaJuridica4();
		pj1.setCnpj("123.123.123/0001-00");
		pj1.setNome("Empresa de tecnologia");
		

		try {

			em.persist(ps4);
			em.persist(pj1);

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
