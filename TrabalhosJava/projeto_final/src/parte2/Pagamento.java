package parte2;

public class Pagamento implements TipoPagamento {
	// Atributos
	protected TipoPagamento pagamento;
	protected double valor;

	// Encapsulamento
	public TipoPagamento getPagamento() {
		return pagamento;
	}

	public void setPagamento(TipoPagamento pagamento) {
		this.pagamento = pagamento;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	@Override
	public int getDiasFaturamento() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getPorcentagemFinanceira() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String formaPagEscolhida() {
		return "Cartão de Crédito";
	}

}
