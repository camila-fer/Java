package parte2;

public class CartaoDeCredito implements TipoPagamento{

	@Override
	public int getDiasFaturamento() {	
		return 1;
	}

	@Override
	public double getPorcentagemFinanceira() {
		return 0.1;
	}

	@Override
	public String formaPagEscolhida() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
