package br.com.icev.estruturaed.atividade1;

import java.math.BigDecimal;

import br.com.icev.estruturaed.atividade1.models.Produto;
import br.com.icev.estruturaed.atividade1.models.ProdutoAlimenticio;
import br.com.icev.estruturaed.atividade1.models.Promocao;
import br.com.icev.estruturaed.atividade1.models.Promocao.TipoDePromocao;

public class MainPromocao {
	public static void main(String[] args) {
		Produto p = new ProdutoAlimenticio();

		p.setNome("Arroz");
		p.setPreco(new BigDecimal(10));

		System.out.println("Preço antes: " + p.getPreco());

		Promocao promo = new Promocao();
		promo.setDesconto(new BigDecimal(3));
		promo.setTipoDePromocao(TipoDePromocao.VALOR);

		p.setPromocao(promo);
		System.out.println("Preço atual: " + p.getPreco());

		Promocao desc = new Promocao();
		desc.setDesconto(new BigDecimal(0.9));
		desc.setTipoDePromocao(TipoDePromocao.PORCENTAGEM);

		p.setPromocao(desc);
		System.out.println("Preço atual (desc): " + p.getPreco());
	}
}
