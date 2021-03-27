package estudoCaso_Heranca;

public class Fornecedor extends Pessoa{
	protected double valorCredito;
	protected double valorDivida;
	
	// Construtor
	public Fornecedor(String n, String end, String fone, double vCredito, double vDivida) {
		super(n, end, fone);
		this.valorCredito = vCredito;
		this.valorDivida = vDivida;
	}

	public double getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}

	public double getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}
	
	// M�todo
	public double obterSaldo(double valor) {
		System.out.println("------ Novo valor do cr�dito depois da d�vida ------");
		valor = this.valorCredito -= this.valorDivida;
		System.out.println("D�vida paga!");
		System.out.println("Seu saldo agora � de: " + valor);
		System.out.println("----------------------------------------------------");
		System.out.println("");
		return valor;
	}
	
	@Override
	public void imprimir() {
		super.imprimir();
		System.out.println("Valor do Cr�dito: " + getValorCredito());
		System.out.println("Valor da D�vida: " + getValorDivida());
		System.out.println("---------------------------------------");
		System.out.println("");
	}
	
}
