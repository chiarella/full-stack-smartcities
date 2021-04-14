package br.com.entity4TABLEPERCLASS;

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
@Table(name = "tb_pessoa4")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Pessoa4 {

	/*
	 * Ao cadastra uma PF ou PJ autamtica o hibernate cadastra na tabela filha e
	 * pai. Repete as colunas e atributos podemos utlizar o @Table podemos
	 * instanciar e persistir em qualquer das 3 tabelas
	 */

	@Id
	@SequenceGenerator(name = "pessoa4", sequenceName = "sq_pessoa4", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pessoa4")
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

	public Pessoa4() {
		super();
	}

	public Pessoa4(int id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

}
