package horario;

public class Horario {
	// Atributos
	private int hora;
	private int minuto;
	private int segundo;
	
	// Método construtor
	public Horario(int h, int m, int s) {
		// ja vai definir as tres infos criadas abaixo nos métodos
		this.setHora(h);
		this.setMinuto(m);
		this.setSegundo(s);
	}
	
	// Métodos para encapsulamento dos atributos
	public int getHora() {
		return hora;
	}
	public void setHora(int hora) {
		if(hora >= 0 && hora <= 24) {
			this.hora = hora;	
		}
		else {
			this.hora = 1;
			System.err.println("Hora inválida. Definido como 1");
		}
	}
	public int getMinuto() {
		return minuto;
	}
	public void setMinuto(int minuto) {
		if(minuto >= 0 && minuto < 60) {
			this.minuto = minuto;	
		}
		else {
			this.minuto = 1;
			System.err.println("Minuto inválido. Definido como 1");
		}
	}
	public int getSegundo() {
		return segundo;
	}
	public void setSegundo(int segundo) {
		this.segundo = segundo;
		if(segundo >= 0 && segundo < 60) {
			this.segundo = segundo;	
		}
		else {
			this.segundo = 1;
			System.err.println("Segundo inválido. Definido como 1");
		}
	}
	
	// mostrar horario no formato correto
	@Override
	public String toString() {
		return hora + ":" + minuto + ":" + segundo;
	}
	
	public void mostrarHorario() {
		System.out.println("Horário: " + toString());
	}
	
	public void incrementarSegundo() {
		this.segundo ++;
	}
	
}
