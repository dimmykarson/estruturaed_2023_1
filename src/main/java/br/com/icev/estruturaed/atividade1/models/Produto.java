package br.com.icev.estruturaed.atividade1.models;

import java.math.BigDecimal;

public abstract class Produto {
	private Long id;
	private String nome;
	private BigDecimal preco;
	private Promocao promocao;

	public Promocao getPromocao() {
		return promocao;
	}

	public void setPromocao(Promocao promocao) {
		this.promocao = promocao;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getPreco() {
		if (this.promocao != null) {
			switch (this.promocao.getTipoDePromocao()) {
			case VALOR:
				return this.preco.subtract(this.promocao.getDesconto());
			case PORCENTAGEM:
				return this.preco.multiply(this.promocao.getDesconto());
			default:
				break;
			}
		}
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Produto other = (Produto) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
