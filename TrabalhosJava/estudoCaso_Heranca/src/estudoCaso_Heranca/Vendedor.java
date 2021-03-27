package estudoCaso_Heranca;

public class Vendedor extends Empregado{
	// Atributos
	protected double valorVendas;
	protected double comissao;
	
	// Construtor
	public Vendedor(String n, String end, String fone, int codSetor, double salBase, double imp, double venda, double comi) {
		super(n, end, fone, codSetor, salBase, imp);
		this.valorVendas = venda;
		this.comissao = comi;
	}

	// Encapsulamento
	public double getValorVendas() {
		return valorVendas;
	}

	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	@Override
	public double calcularSalario() {
		return this.salarioBase += (valorVendas * comissao/100);		
	}

	@Override
	public void imprimir() {
		System.out.println("--- Acrescido da comissão ---");
		System.out.println("Novo Salário: " + getSalarioBase());
		System.out.println("-----------------------------");
		System.out.println("");
	}
	
}
