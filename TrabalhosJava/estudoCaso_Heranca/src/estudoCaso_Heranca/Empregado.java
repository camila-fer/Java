package estudoCaso_Heranca;

public class Empregado extends Pessoa{
	// Atributos
	protected int codigoSetor;
	protected double salarioBase;
	protected double imposto;
	
	// Construtor
	public Empregado(String n, String end, String fone, int codSetor, double salBase, double imp) {
		super(n, end, fone);
		this.codigoSetor = codSetor;
		this.salarioBase = salBase;
		this.imposto = imp;
	}

	// Encapsulamento
	public int getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getImposto() {
		return imposto;
	}

	public void setImposto(double imposto) {
		this.imposto = imposto;
	}
	
	public double calcularSalario() {
		// salario base descontado o imposto
		return this.salarioBase += this.salarioBase * this.imposto/100;
	}
	
	@Override
	public void imprimir() {
		System.out.println("--- Retornar o sal�rio do empregado (sal�rio base descontando o imposto) ---");
		System.out.println("Novo Sal�rio: " + getSalarioBase());
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("");
	}
}
