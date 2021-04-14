package br.com.entity3JOINED;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Pessoa3 {
	
	/*
	 * Ao cadastra uma PF ou PJ autamtica o hibernate cadastra na tabela filha e pai.
	 * Serao criadas 3 tabelas Pessoa-pai, PF e PF filhas
	 */

	@Id
	@SequenceGenerator(name = "pessoa3", sequenceName = "sq_pessoa3", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pessoa3")
	private int id;

	@Column(length = 50, nullable = false)
	private String nome;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
