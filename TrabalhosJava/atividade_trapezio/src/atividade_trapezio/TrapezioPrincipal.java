package atividade_trapezio;

import java.util.Scanner;

public class TrapezioPrincipal {

	public static void main(String[] args) {
		// Instancia do objeto da classe Trapezio
		Trapezio trapezio = new Trapezio();
		
		// criar um objeto da classe Scanner
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		// Pego os dados digitados pelo usuario
		System.out.print("Entre com o valor da Base Maior: ");
		int baseMaior = entrada.nextInt();
		System.out.print("Entre com o valor da Base Menor: ");
		int baseMenor = entrada.nextInt();
		System.out.print("Entre com o valor da Altura: ");
		int altura = entrada.nextInt();
		
		trapezio.setBaseMaior(baseMaior);
		trapezio.setBaseMenor(baseMenor);
		trapezio.setAltura(altura);		
		
		trapezio.calcularArea();

	}

}
