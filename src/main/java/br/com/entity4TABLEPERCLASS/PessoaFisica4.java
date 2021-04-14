package br.com.entity4TABLEPERCLASS;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="tb_pessoa_fisica4")
public class PessoaFisica4 extends Pessoa4 {

	/*
	 * Não precisa mapear o "ID", vai vim como herança da classe pessoa
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
