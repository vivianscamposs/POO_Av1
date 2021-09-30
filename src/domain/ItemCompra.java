package domain;

public class ItemCompra extends Produto{

	public int quantidade;

	public ItemCompra(float valor, String nome, int quantidade) {
		super(valor, nome);
		this.quantidade = quantidade;
	}
	
	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

}
