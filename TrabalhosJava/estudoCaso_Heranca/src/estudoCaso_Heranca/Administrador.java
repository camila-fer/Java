package estudoCaso_Heranca;

public class Administrador extends Empregado{
	// Atributos
	protected double ajudaDeCusto;
	
	// Construtor
	public Administrador(String n, String end, String fone, int codSetor, double salBase, double imp, double custo) {
		super(n, end, fone, codSetor, salBase, imp);
		this.ajudaDeCusto = custo;
	}

	// Encapsulamento
	public double getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(double ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}

	@Override
	public double calcularSalario() {
		return this.salarioBase = (this.salarioBase + ajudaDeCusto);
		//return super.calcularSalario() + this.salarioBase * this.ajudaDeCusto;
	}
	
	@Override
	public void imprimir() {
		System.out.println("--- NOVO VALOR ACRESCIDO DA AJUDA DE CUSTO ---");
		System.out.println("Novo Salário: " + getSalarioBase());
		System.out.println("----------------------------------------------");
		System.out.println("");
	}
	
}
