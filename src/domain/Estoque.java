package domain;

import java.util.Iterator;
import java.util.Vector;

public class Estoque {
	private static Vector<Produto> produtos;

	public Estoque() {
	}

	public Vector<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(Vector<Produto> produtos) {
		Estoque.produtos = produtos;
	}
	
	public static void AdicionarProdutos() {
		Vector<Produto> produtos = new Vector<Produto>();
		produtos.add(new Produto(10, "Caderno"));
		produtos.add(new Produto(13, "Livro"));
		produtos.add(new Produto(20, "Mochila"));
		produtos.add(new Produto(3, "Lapis"));
		Iterator<Produto> itr = produtos.iterator();
		System.out.println("=========Lista de Produtos Disponíveis no estoque========");
	    while (itr.hasNext()) {
	    	System.out.println(itr.next().getNome());
	    }
	}
	
	
	public static Produto obtemProduto (String nome) {
		for(Produto produto : produtos) {
			if (produto.getNome() == nome)
				return produto;
		}
		return null;
	}

}
