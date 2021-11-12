
package domain;

public class Cliente {
	
	public String nome;
	public Endereco Endereco;
	
	public Cliente(String nome, domain.Endereco endereco) {
		this.nome = nome;
		Endereco = endereco;
	}

	public Endereco getEndereco() {
		return Endereco;
	}

	public void setEndereco(Endereco endereco) {
		Endereco = endereco;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	

	public static void InformacoesDoCliente() {
		var endereco = new Endereco("Largo Grimmauld", 12, "XXXXX-000", "Borough of Islington", "Londres", "EN");
		var cliente = new Cliente("Vivian Saldanha Campos", endereco);
		System.out.println("================Informações do Cliente====================");
		System.out.println("Nome do cliente: " + cliente.getNome());
		System.out.println("================Endereço de Entrega=======================");
		System.out.println("Logradouro: " + endereco.getLogradouro());
		System.out.println("Nº " + endereco.getNumero());
		System.out.println("Cep: " + endereco.getCep());
		System.out.println("Bairro: " + endereco.getBairro());
		System.out.println("Cidade: " + endereco.getCidade());
		System.out.println("Estado: " + endereco.getEstado());
		
	}
	

}
