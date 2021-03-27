package parte2;

public class Boleto implements TipoPagamento{

	@Override
	public int getDiasFaturamento() {
		// Retorna valor 3
		return 3;
		
	}

	@Override
	public double getPorcentagemFinanceira() {
		// Retorna valor 0.05
		return 0.05;
	}

	@Override
	public String formaPagEscolhida() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
