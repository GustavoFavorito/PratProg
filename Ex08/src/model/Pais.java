package model;

import java.io.Serializable;

public class Pais implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private String nome;
	private Long populacao;
	private Double area;

	public Pais() {
	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public Long getPopulacao() {
		return populacao;
	}

	public Double getArea() {
		return area;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setPopulacao(Long populacao) {
		this.populacao = populacao;
	}

	public void setArea(Double area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return "Pais [id=" + id + ", nome=" + nome + ", populacao=" + populacao
				+ ", area=" + area + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pais other = (Pais) obj;
		if (area != other.area)
			return false;
		if (populacao != other.populacao)
			return false;
		if (id != other.id)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
}