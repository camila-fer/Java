package projeto_final;

public class Produto {
	// Atributos
	protected String nome;
	protected double preco;
	protected int quantidade;

	// Construtor
	public Produto(String nome, double preco, int quant) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quant;
	}

	// Encapsulamento
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	// Método
	public void imprimir() {
		System.out.println("-----------------------------");
		System.out.println("Nome do Produto: " + nome);
		System.out.println("Preço: " + preco);
		System.out.println("Quantidade: " + quantidade);
	}
}
