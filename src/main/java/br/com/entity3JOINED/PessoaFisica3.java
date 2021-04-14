package br.com.entity3JOINED;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
public class PessoaFisica3 extends Pessoa3 {

	/*
	 * N�o precisa mapear o "ID", vai vim como heran�a da classe pessoa
	 */

	@Column(name = "nr_cpf")
	private String cpf;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
