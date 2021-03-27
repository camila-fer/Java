package estudoCaso_Heranca;

public class Operario extends Empregado{
	// Atributos
	protected double valorProducao;
	protected double comissao;
	
	// Construtor
	public Operario(String n, String end, String fone, int codSetor, double salBase, double imp, double vProd, double comis) {
		super(n, end, fone, codSetor, salBase, imp);
		this.valorProducao = vProd;
		this.comissao = comis;
	}

	// Encapsulamento
	public double getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	@Override
	public double calcularSalario() {
		return this.salarioBase += (valorProducao * comissao/100);
	}
	
	@Override
	public void imprimir() {
		System.out.println("--- Acrescido da comissão do valor de produção ---");
		System.out.println("Novo Salário: " + getSalarioBase());
		System.out.println("--------------------------------------------------");
		System.out.println("");
	}

}
