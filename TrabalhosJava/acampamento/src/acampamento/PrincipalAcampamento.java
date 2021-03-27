package acampamento;

import java.util.Scanner;

public class PrincipalAcampamento {

	public static void main(String[] args) {
		// definir um objeto para a classe Acampamento
		Acampamento acam = new Acampamento();
		
		// criar um objeto da classe Scanner
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);

		// coletar as informações e atribuir aos atributos
		System.out.print("Entre com o nome: ");
		String nome = entrada.next();
		
		System.out.print("Entre com o valor da idade: ");
		int idade = entrada.nextInt();
		
		acam.setNome(nome);
		acam.setIdade(idade);
		
		// mostrar os valores na tela
		acam.separarGrupo();
		acam.imprimir();

	}

}
