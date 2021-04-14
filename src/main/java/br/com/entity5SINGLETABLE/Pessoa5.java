package br.com.entity5SINGLETABLE;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="tb_pessoa5")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="name_tipo") //ou DTYPE por padrão
public class Pessoa5 {
	
	/*
	 * Ao cadastra uma PF ou PJ autamtica o hibernate cadastra na tabela filha e pai.
	 * Repete as colunas e atributos
	 * podemos utlizar o @Table
	 * podemos instanciar e persistir em qualquer das 3 tabelas
	 * 
	 * table com 4 campos + DTYPE
	 * Problema: Nem sempre vai preencher todos os campos (não pode NULLABLE)
	 * 
	 */

	@Id
	@SequenceGenerator(name = "pessoa5", sequenceName = "sq_pessoa5", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pessoa5")
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
