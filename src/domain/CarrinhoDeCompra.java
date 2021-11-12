package domain;

public class CarrinhoDeCompra {
	private static boolean RealizarCompra;

	public static void AdicionarAoCarrinho() {
		var itemCompra = new ItemCompra(20, "Caderno", 10);
		var valorTotal = calculaValorTotal(20, 10);
		var fabricante = new Marketplace("Gemialidades Weasley", "08.050.452/0001-90");
		
		System.out.println("============Carrinho de Compra==========================");
		System.out.println("Nome do item do produto: " + itemCompra.getNome());
		System.out.println("Valor do item do produto: " + itemCompra.getValor());
		System.out.println("Quantidade do item do produto: " + itemCompra.getQuantidade());
		System.out.println("Valor total: R$" + valorTotal);
		System.out.println("Fabricado por: " + fabricante.getName());
		System.out.println("Cnpj: " + fabricante.getCnpj());
		
	}
	
	

	public static float calculaValorTotal (float valor, int quantidade) {
		return valor * quantidade;
	}
	
	public static boolean RealizarCompra() {
		boolean comprar = setRealizarCompra(true);
		return comprar;
	}
	
	public static boolean isRealizarCompra() {
		return RealizarCompra;
	}

	public static boolean setRealizarCompra(boolean realizarCompra) {
		return RealizarCompra = realizarCompra;
	}

}
