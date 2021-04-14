package br.com.entity5SINGLETABLE;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("PJ")
public class PessoaJuridica5 extends Pessoa5 {
	
	/*
	 * N�o precisa mapear o "ID", vai vim como heran�a da classe pessoa
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
