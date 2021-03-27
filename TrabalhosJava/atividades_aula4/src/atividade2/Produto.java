package atividade2;

public class Produto {
	// Atributos
	protected String nome;
	protected int quantidade;
	protected double valorUnitario;
	
	// Construtot
	public Produto(String n, int q, double v) {
		this.nome = n;
		this.quantidade = q;
		this.valorUnitario = v;
	}

	// Encapsulamento
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	
	// Métodos
	public void retirar(int quant) {
		if(quant <= quantidade) {
			this.quantidade -= quant;
			System.out.println("Quantidade retirada: " + quant);
			System.out.println("Nova quantidade: " + getQuantidade());
		}else {
			System.err.println("A quantidade é insuficiente");
		}
	}
	
	public void adicionar(int quant) {
		this.quantidade += quant;
		System.out.println("Quantidade adicionada: " + quant);
		System.out.println("Nova quantidade: " + getQuantidade());
	}
	
	public void imprimir() {
		System.out.println("---------- SOBRE O PRODUTO ----------");
		System.out.println("Nome: " + getNome());
		System.out.println("Quantidade: " + getQuantidade());
		System.out.println("Valor Unitário: " + getValorUnitario());
	}
}
