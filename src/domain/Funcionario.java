package domain;

public class Funcionario {
	public String nome;

	public Funcionario(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public static void InformacoesDoFuncionario() {
		System.out.println("==============Informa��es do Funcion�rio==================");
		var funcionario = new Funcionario("Luna Lovegood");
		System.out.println("Nome do funcion�rio: " + funcionario.getNome());
	}
	

}
