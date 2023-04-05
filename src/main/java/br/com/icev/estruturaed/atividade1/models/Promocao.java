package br.com.icev.estruturaed.atividade1.models;

import java.math.BigDecimal;

public class Promocao {

	public enum TipoDePromocao {
		PORCENTAGEM, VALOR;
	}

	private String nome;
	private Long id;
	private BigDecimal desconto;
	private TipoDePromocao tipoDePromocao;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public BigDecimal getDesconto() {
		return desconto;
	}

	public void setDesconto(BigDecimal desconto) {
		this.desconto = desconto;
	}

	public TipoDePromocao getTipoDePromocao() {
		return tipoDePromocao;
	}

	public void setTipoDePromocao(TipoDePromocao tipoDePromocao) {
		this.tipoDePromocao = tipoDePromocao;
	}

}
