package entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "tb_cliente")
public class Cliente {

	@Id
	@SequenceGenerator(name = "cliente", sequenceName = "sq_tb_cliente", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cliente")
	@Column(name = "cd_cliente")
	private int id;

	@Column(name = "nm_cliente")
	private String nome;

	@ManyToMany(mappedBy = "clientes")
	private List<Estabelecimento> estabelecimento;

	public Cliente() {
		super();
	}
	
	public Cliente(int id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

	public Cliente(int id, String nome, List<Estabelecimento> estabelecimento) {
		super();
		this.id = id;
		this.nome = nome;
		this.estabelecimento = estabelecimento;
	}

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

	public List<Estabelecimento> getEstabelecimento() {
		return estabelecimento;
	}

	public void setEstabelecimento(List<Estabelecimento> estabelecimento) {
		this.estabelecimento = estabelecimento;
	}

}
