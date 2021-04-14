package br.com.entity3JOINED;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
public class PessoaJuridica3 extends Pessoa3 {
	
	/*
	 * Não precisa mapear o "ID", vai vim como herança da classe pessoa
	 */
	
	@Column(name="nr_cnpj")
	private String cnpj;

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	

}
