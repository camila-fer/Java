package atividade1;

public class Ponto {
	// Atributos
	protected int x;
	protected int y;
	
	// Construtor
	public Ponto(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// Encapsulamento
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	// To String
	@Override
	public String toString() {
		return "[" + x + ", " + y + "]";
	}
}
