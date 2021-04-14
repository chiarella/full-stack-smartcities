package br.com.entity5SINGLETABLE;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("PF")
public class PessoaFisica5 extends Pessoa5 {

	/*
	 * Não precisa mapear o "ID", vai vim como herança da classe pessoa Criar uma
	 * 
	 */

	@Column(name = "nr_cpf")
	private String cpf;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public PessoaFisica5() {
		super();
	}

	public PessoaFisica5(String cpf) {
		super();
		this.cpf = cpf;
	}
	

}
