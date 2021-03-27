package estudoCaso_Heranca;

public class Pessoa {
	protected String nome;
	protected String endereco;
	protected String telefone;
	
	// Construtor
	public Pessoa(String n, String end, String fone) {
		this.nome = n;
		this.endereco = end;
		this.telefone = fone;
	}
	
	// Encapsulamento
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public void imprimir() {
		System.out.println("---------- DADOS ------------");
		System.out.println("Nome: " + getNome());
		System.out.println("Endereço: " + getEndereco());
		System.out.println("Telefone: " + getTelefone()); 
	}
	
}
