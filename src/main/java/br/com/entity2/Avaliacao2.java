package br.com.entity2;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tb_avalicao2")
@IdClass(AvaliacaoId2.class)
public class Avaliacao2 implements Serializable{
	
	@Id
	@JoinColumn(name="id_usuario2")
	@ManyToOne(optional = false)
	private Usuario2 usuario2;
	
	@Id
	@JoinColumn(name="id_estabelecimento2")
	@ManyToOne(optional = false)
	private Estabelecimento2 estabelecimento2;
	
	@Column(name="vl_nota")
	private int nota;

	public Usuario2 getUsuario2() {
		return usuario2;
	}

	public void setUsuario2(Usuario2 usuario2) {
		this.usuario2 = usuario2;
	}

	public Estabelecimento2 getEstabelecimento2() {
		return estabelecimento2;
	}

	public void setEstabelecimento2(Estabelecimento2 estabelecimento2) {
		this.estabelecimento2 = estabelecimento2;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}
	
	
	
	

}
