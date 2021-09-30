package domain;

public class Marketplace {
	private String name;
	private String Cnpj;
	
    public Marketplace(String name, String Cnpj) {
		this.name = name;
		this.Cnpj = Cnpj;
	}

    public String getName() {
		return name;
	}
    
	public void setName(String name) {
		this.name = name;
	}

	public String getCnpj() {
		return Cnpj;
	}

	public void setCnpj(String cnpj) {
		Cnpj = cnpj;
	}

}
