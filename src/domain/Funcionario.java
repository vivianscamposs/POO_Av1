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
		System.out.println("==============Informações do Funcionário==================");
		var funcionario = new Funcionario("Luna Lovegood");
		System.out.println("Nome do funcionário: " + funcionario.getNome());
	}
	

}
