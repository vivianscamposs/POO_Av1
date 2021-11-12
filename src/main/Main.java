package main;

import domain.CarrinhoDeCompra;
import domain.Cliente;
import domain.Estoque;
import domain.Funcionario;

public class Main {

	public static void main(String[] args) {
		
		Estoque.AdicionarProdutos();
		CarrinhoDeCompra.AdicionarAoCarrinho();
		Cliente.InformacoesDoCliente();
		Funcionario.InformacoesDoFuncionario();
		var compra = CarrinhoDeCompra.RealizarCompra();
		System.out.println("==================Informações da compra===================");
		System.out.println("Compra: " + compra);
	}
	
	
	
}
