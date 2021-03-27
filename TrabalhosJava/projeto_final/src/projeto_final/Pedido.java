package projeto_final;

import java.util.ArrayList;

public class Pedido {
	// Associação a classe Produto
	protected ArrayList<Perecivel> produtos = new ArrayList<Perecivel>();
	protected int idPedido;

	// Encapsulamento
	public ArrayList<Perecivel> getProdutos() {
		return produtos;
	}

	public void setProdutos(ArrayList<Perecivel> produtos) {
		this.produtos = produtos;
	}
	
	public int getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}

	public void iniciar() {
		// Inicializar o vetor
		produtos = new ArrayList<Perecivel>();
	}

	public void adicionarProdutos(String nome, double preco, int quantidade, Data dataV) {
		// ArrayList<Produto> produtos = new ArrayList<Produto>();
		// Produto novo = new Produto(nome, preco, quantidade);
		Perecivel novo = new Perecivel(nome, preco, quantidade, dataV);
		produtos.add(novo);

		// produtos.add(novo);

		for (Perecivel p1 : produtos) {
			// Pega os valores
			p1.getNome();
			p1.getPreco();
			p1.getQuantidade();
			p1.getData_validade();
		}

		novo.imprimir();

	}

	public double calcularValor() {

		double soma = 0;
		int qtd = 0;
		
		for (Perecivel p : produtos) {
			// Calcula o valor
			soma += p.getPreco();
			qtd += p.getQuantidade();
		}
		System.out.printf("Soma total dos produtos: " + String.format("%.2f%n", soma));
		System.out.println("Quantidade total de itens: " + qtd);
		System.out.println("");
		return soma;
		

	}
}
