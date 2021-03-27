package atividade2;

public class ProdutoPerecivel extends Produto{
	// Atributo
	protected Data dataValidade;
	protected Data dataRetirada;
	
	// Construtor da classe Produto
	public ProdutoPerecivel(String n, int q, double v) {
		super(n, q, v);
		setDataValidade(dataValidade);
		setDataRetirada(dataRetirada);
	}

	// Encapsulamento
	public Data getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(Data dataValidade) {
		this.dataValidade = dataValidade;
	}

	public Data getDataRetirada() {
		return dataRetirada;
	}

	public void setDataRetirada(Data dataRetirada) {
		this.dataRetirada = dataRetirada;
	}

	// Métodos
	@Override
	public void retirar(int quant) {
		// Vencidos
		if(dataRetirada.getMes() > dataValidade.getMes()) {
			this.quantidade -= quant;
			System.out.println("Vencido! O estoque foi zerado");
		}
		else {
			super.retirar(quant);	
		}	
		
	}
	
	@Override
	public void adicionar(int quant) {
		if(this.quantidade == 0) {
			super.adicionar(quant);
		}
		else {
			System.err.println("Não é possível adicionar mais ao estoque. Para não misturar produtos com diferentes datas de validade.");
		}
	}
	
	@Override
	public void imprimir() {
		super.imprimir();
		System.out.println("Data de Validade: " + getDataValidade());
		System.out.println("-------------------------------------");
	}
}
