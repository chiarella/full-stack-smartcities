package br.com.entity2;

import java.io.Serializable;

public class AvaliacaoId2 implements Serializable{

	private int usuario2;

	private int estabelecimento2;

	public AvaliacaoId2() {
		super();
	}

	public AvaliacaoId2(int usuario2, int estabelecimento2) {
		super();
		this.usuario2 = usuario2;
		this.estabelecimento2 = estabelecimento2;
	}

	public int getUsuario2() {
		return usuario2;
	}

	public void setUsuario2(int usuario2) {
		this.usuario2 = usuario2;
	}

	public int getEstabelecimento2() {
		return estabelecimento2;
	}

	public void setEstabelecimento2(int estabelecimento2) {
		this.estabelecimento2 = estabelecimento2;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + estabelecimento2;
		result = prime * result + usuario2;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AvaliacaoId2 other = (AvaliacaoId2) obj;
		if (estabelecimento2 != other.estabelecimento2)
			return false;
		if (usuario2 != other.usuario2)
			return false;
		return true;
	}
	

}
