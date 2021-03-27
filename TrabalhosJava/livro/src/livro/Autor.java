package livro;

public class Autor {
	// Atributos
	private String nome;
	private String pais;
	private String sexo;

	// Métodos para o encapsulamento dos atributos
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	// Método para imprimir
	public void imprimir() {
		// mostro os dados na tela
		System.out.println("----------- AUTOR -----------");
		System.out.println("Nome: " + getNome());
		System.out.println("País: " + getPais());
		System.out.println("Sexo: " + getSexo());
	}

}
