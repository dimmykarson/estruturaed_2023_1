package br.com.icev.estruturaed.atividade1;

import java.util.ArrayList;

import br.com.icev.estruturaed.atividade1.models.Produto;

public class GestaoProduto {
	private ArrayList<Produto> produtos = new ArrayList<Produto>();

	// CREATE
	public Produto create(Produto p) {
		initList();
		produtos.add(p);
		return p;

	}

	// READ BY ID
	public Produto findById(Long id) {
		initList();
		for (Produto p : this.produtos) {
			if (p.getId() != null && p.getId().equals(id)) {
				return p;
			}
		}
		return null;
	}

	public ArrayList<Produto> findAll() {
		return this.produtos;
	}

	public ArrayList<Produto> findByNome(String nome) {
		ArrayList<Produto> p_aux = new ArrayList<Produto>();
		initList();
		for (Produto p : this.produtos) {
			if (p.getNome() != null 
					&& p.getNome()
					.toUpperCase()
					.contains(nome.toUpperCase())) {
				p_aux.add(p);
			}
		}
	}
//	UPDATE
//	DELETE

	private void initList() {
		if (produtos == null) {
			produtos = new ArrayList<Produto>();
		}
	}

}
