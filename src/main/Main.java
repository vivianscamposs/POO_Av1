package main;

import domain.CarrinhoDeCompra;
import domain.Estoque;

public class Main {

	public static void main(String[] args) {
		
		Estoque.AdicionarProdutos();
		CarrinhoDeCompra.AdicionarAoCarrinho();
		var compra = CarrinhoDeCompra.RealizarCompra();
		System.out.println("Compra: " + compra);
	}
	
	
	
}
