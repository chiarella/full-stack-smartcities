package br.com.entity4TABLEPERCLASS;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_pessoa_jurida4")
public class PessoaJuridica4 extends Pessoa4 {

	/*
	 * Não precisa mapear o "ID", vai vim como herança da classe pessoa
	 */

	@Column(name = "nr_cnpj")
	private String cnpj;

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public PessoaJuridica4() {
		super();
	}

	public PessoaJuridica4(String cnpj) {
		super();
		this.cnpj = cnpj;
	}

}
