package atividade1;

public class Circulo extends Ponto{
	// Atributo
	protected int raio;

	// Construtor
	public Circulo(int x, int y, int raio) {
		super(x, y);
		setRaio(raio);
	}
	
	// Encapsulamento
	public int getRaio() {
		return raio;
	}

	public void setRaio(int raio) {
		if(raio <= 0) {
			raio = 0;
		}
		else {
			this.raio = raio;	
		}
	}
	
	// Método calcula area
	public double Area() {
		return Math.PI * raio * raio;
	}
	
	// to string
	@Override
	public String toString() {
		return "Centro definido como: " + super.toString() + "\nRaio: " + raio;
	}
}
