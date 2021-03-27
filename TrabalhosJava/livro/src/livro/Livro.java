package livro;

public class Livro {
	// Atributos
	private Autor autor;
	private String titulo;
	private int ano;

	// Métodos para o encapsulamento dos atributos
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	// Método para imprimir
	public void imprimir() {
		// mostro os dados na tela
		System.out.println("----------- LIVRO -----------");
		System.out.println("Autor do livro: " + getAutor().getNome());
		System.out.println("Titulo: " + getTitulo());
		System.out.println("Ano: " + getAno());
	}

}
