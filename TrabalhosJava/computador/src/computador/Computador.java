package computador;

public class Computador {
	// declaro as variaveis
	String marca;
	String cor;
	String modelo;
	int numeroSerie;
	double preco;
	
	// métodos
	void imprimir() {
		// mostro os dados na tela
		System.out.println("------ Dados do Computador ------");
		System.out.println("Marca: " + this.marca);
		System.out.println("Cor: " + this.cor);
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Número Serie: " + this.numeroSerie);
		System.out.println("Preco: " + this.preco);
		System.out.println("----------------------------------");
	}
	
	void calcularValor() {
		if(this.marca.equals("HP")) {
			this.preco = this.preco * 1.30;
		}
		else if(this.marca.equals("IBM")) {
			this.preco = this.preco * 1.50;
		}
	}
	
	int alterarValor(double novo) {
		if(novo > 0) {
			this.preco = novo;
			System.out.println("Alterado");
			return 1;
		}
		else {
			System.out.println("Não Alterado");
			return 0;
		}
	}

	
}
