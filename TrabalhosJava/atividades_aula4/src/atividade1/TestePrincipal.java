package atividade1;

import java.util.Scanner;

public class TestePrincipal {

	public static void main(String[] args) {
		
		System.out.println("CALCULAR CIRCULO");
		
		// criar um objeto da classe Scanner
		Scanner entrada = new Scanner(System.in);
		
		// Pego as informações do usuario
		System.out.print("Valor de X: ");
		int x = entrada.nextInt();
		System.out.print("Valor de Y: ");
		int y = entrada.nextInt();
		System.out.print("Valor de Raio: ");
		int raio = entrada.nextInt();
		
		// chamo o objeto da subclasse Circulo
		Circulo circ = new Circulo(x, y, raio);
		
		circ.setX(x);
		circ.setY(y);
		circ.setRaio(raio);
		
		System.out.println(circ);
		
		circ.Area();
		System.out.println("Valor da area é: " + circ.Area());
		System.out.println("--------------------------------------");
		
		// TESTE PARA O CILINDRO
		System.out.println("CALCULAR CILINDRO");
				
		// Pego a altura informada pelo usuario
		System.out.print("Valor da Altura: ");
		int altura = entrada.nextInt();
				
		// chamo o objeto da subclasse Cilindro
		Cilindro cilindro = new Cilindro(x, y, raio, altura);

		cilindro.setX(x);
		cilindro.setY(y);
		cilindro.setRaio(raio);
		cilindro.setAltura(altura);
		
		System.out.println(cilindro);
		
		cilindro.Area();
		cilindro.volume();
		System.out.println("Valor da area é: " + cilindro.Area());
		System.out.println("Valor do volume é: " + cilindro.volume());
		System.out.println("--------------------------------------");			
	}

}
