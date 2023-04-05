package br.com.icev.estruturaed.atividade1;

import java.util.ArrayList;

import br.com.icev.estruturaed.atividade1.models.Produto;

public class GestaoProduto {
	private ArrayList<Produto> produtos = new ArrayList<Produto>();
	private Long ultimoId = 0l;

	// CREATE
	public Produto create(Produto p) {
		initList();
		p.setId(getNextId());
		produtos.add(p);
		return p;

	}

	// READ BY ID
	public Produto findBy(Long id) {
		initList();
		for (Produto p : this.produtos) {
			if (p.getId() != null && p.getId().equals(id)) {
				return p;
			}
		}
		return null;
	}

	public ArrayList<Produto> findBy() {
		return this.produtos;
	}

	public ArrayList<Produto> findBy(String nome) {
		ArrayList<Produto> p_aux = new ArrayList<Produto>();
		initList();
		for (Produto p : this.produtos) {
			if (p.getNome() != null && p.getNome().toUpperCase().contains(nome.toUpperCase())) {
				p_aux.add(p);
			}
		}
		return p_aux;
	}

	public ArrayList<Produto> findBy(Class clazz) {
		ArrayList<Produto> p_aux = new ArrayList<Produto>();
		initList();
		for (Produto p : this.produtos) {

		}
		return p_aux;
	}

	// UPDATE
	public Produto update(Long id, Produto produtoBase) {
		Produto produtoToUpdate = findBy(id);
		if (produtoToUpdate != null) {
			produtoToUpdate.setNome(produtoBase.getNome());
			produtoToUpdate.setPreco(produtoBase.getPreco());
		}
		return produtoToUpdate;
	}

	// DELETE
	public void delete(Long id) {
		Produto produtoToDelete = findBy(id);
		if (produtoToDelete != null) {
			this.produtos.remove(produtoToDelete);
		}
	}

	private void initList() {
		if (produtos == null) {
			produtos = new ArrayList<Produto>();
		}
	}

	public Long getNextId() {
		return ++ultimoId;
	}

}
