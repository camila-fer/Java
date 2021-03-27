package atividade1;

public class Cilindro extends Circulo{
	// Atributo
	protected int altura;
	
	// Construtor
	public Cilindro(int x, int y, int raio, int alt) {
		super(x, y, raio);
		setAltura(alt);
	}

	// Encapsulamento
	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		if(altura <= 0) {
			altura = 0;
		}
		else {
			this.altura = altura;	
		}
	}
	
	@Override
	public double Area() {
		return 2 * super.Area() + Math.PI * raio * altura;
	}
	
	public double volume() {
		return super.Area() * altura;
	}

	public String toString(){
		return super.toString()+ "\nAltura: " + altura;
	}

}
