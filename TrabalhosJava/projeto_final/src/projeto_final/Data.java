package projeto_final;

public class Data {
	// Atributos
	private int dia;
	private int mes;
	private int ano;

	// Método construtor
	public Data(int d, int m, int a) {
		// ja vai definir as tres infos criadas abaixo nos métodos
		this.setDia(d);
		this.setMes(m);
		this.setAno(a);
	}

	// Sobrecarga do construtor
	public Data() {
		// define valor para os tres acima
		// fica definido os valores criados nos métodos abaixo
		this(1, 1, 0);
	}

	// Métodos para encapsulamento dos atributos
	public int getDia() {
		return dia;
	}

	public void setDia(int d) {
		if (d >= 1 && d <= 31) {
			this.dia = d;
		} else {
			this.dia = 1;
			System.err.println("Dia invalido. Definido como 1");
		}

	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		if (mes >= 1 && mes <= 12) {
			this.mes = mes;
		} else {
			this.mes = 1;
			System.err.println("Mês inválido. Definido como 1");
		}

	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	// mostrar data no formato correto
	@Override
	public String toString() {
		return dia + "/" + mes + "/" + ano;
	}
}
