package projeto_final;


public class Perecivel extends Produto {

	// Associado a classe Data
	protected Data data_validade;

	public Perecivel(String nome, double preco, int quant, Data dataV) {
		super(nome, preco, quant);
		this.data_validade = dataV;
	}

	// Encapsulamento
	public Data getData_validade() {
		return data_validade;
	}

	public void setData_validade(Data data_validade) {
		this.data_validade = data_validade;
	}

	@Override
	public void imprimir() {
		super.imprimir();
		System.out.println("Data de Validade: " + getData_validade());
		System.out.println("-----------------------------");
	}

}
