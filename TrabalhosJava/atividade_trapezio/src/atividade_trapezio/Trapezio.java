package atividade_trapezio;

public class Trapezio {
	// Declaro os atributos
	private int baseMaior;
	private int baseMenor;
	private int altura;
	
	// Métodos para o encapsulamento dos atributos
	public int getBaseMaior() {
		// retorna o valor da variavel
		return baseMaior;
	}
	
	public void setBaseMaior(int bMaior) {
		this.baseMaior = bMaior;
	}

	public int getBaseMenor() {
		return baseMenor;
	}

	public void setBaseMenor(int baseMenor) {
		this.baseMenor = baseMenor;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	// Método calcular area
	public int calcularArea() {
		int area;
		area = ((baseMaior + baseMenor) * altura) / 2;
		System.out.println("A area do trapezio é: " + area);
		return area;
	}
	
}
