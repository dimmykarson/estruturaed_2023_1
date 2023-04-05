package br.com.icev.estruturaed.atividade1;

import java.math.BigDecimal;
import java.util.Scanner;

import br.com.icev.estruturaed.atividade1.models.Produto;
import br.com.icev.estruturaed.atividade1.models.ProdutoAlimenticio;
import br.com.icev.estruturaed.atividade1.models.ProdutoEletronico;
import br.com.icev.estruturaed.atividade1.models.ProdutoVestuario;

public class Main {
	public static void main(String[] args) {
		GestaoProduto gestaoProduto = new GestaoProduto();
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("Sistema de gestão de produtos");
			System.out.println("1 - Cadastrar Produto");
			System.out.println("2 - Listar Produto");
			int opcao = scanner.nextInt();
			if (opcao == 1) {
				System.out.println("Qual o tipo do produto");
				System.out.println("1 - Alimenticio");
				System.out.println("2 - Vestuario");
				System.out.println("3 - Eletronico");
				Produto p = null;
				opcao = scanner.nextInt();
				if (opcao == 1) {
					p = new ProdutoAlimenticio();
				} else if (opcao == 2) {
					p = new ProdutoVestuario();
				} else if (opcao == 3) {
					p = new ProdutoEletronico();
				}
				System.out.println("Informe o nome:");
				String nome = scanner.next();
				System.out.println("Informe o preço");
				double preco = scanner.nextDouble();
				p.setNome(nome);
				p.setPreco(new BigDecimal(preco));
				gestaoProduto.create(p);

			}
		}
	}

}
