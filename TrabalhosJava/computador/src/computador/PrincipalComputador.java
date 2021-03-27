/*
	ATIVIDADE 2: Desenvolver uma classe chamada Computador com os seguintes atributos:
		marca, cor, modelo, numeroSerie, preco. Implementar os seguintes m�todos:
		a) imprimir(): Procedimento que deve exibir os atributos na tela.
		b) calcularValor(): Procedimento que dever� verificar as seguintes condi��es: caso a
		marca seja HP, acrescentar 30% ao pre�o; caso seja IBM, acrescentar 50% ao pre�o;
		caso seja qualquer outra, manter o pre�o original.
		c) alterarValor(): Este m�todo recebe um valor como par�metro. Atribuir este valor
		ao atributo pre�o, caso o valor do par�metro recebido seja maior que 0. Caso seja
		maior que 0, o m�todo alterarValor() dever�, al�m de atribuir o valor ao atributo
		preco, retornar 1. Caso contr�rio, n�o atribuir o valor ao atributo preco e retornar 0.
 */

package computador;

import java.util.Scanner;

public class PrincipalComputador {

	public static void main(String[] args) {
		// definir um objeto para a classe Computador
		Computador comp = new Computador();
		
		// criar um objeto da classe Scanner
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		// coletar as informa��es e atribuir aos atributos
		System.out.print("Entre com a marca: ");
		comp.marca = entrada.next();
		
		System.out.print("Entre com a cor: ");
		comp.cor = entrada.next();
		
		System.out.print("Entre com o modelo: ");
		comp.modelo = entrada.next();
		
		System.out.print("Entre com o Numero Serie: ");
		comp.numeroSerie = entrada.nextInt();
		
		System.out.print("Entre com o preco: ");
		comp.preco = entrada.nextDouble();

		
		comp.imprimir();
		comp.calcularValor();
		comp.imprimir();
		
		// Crio um segundo objeto e atribuir valores a seus atributos
		System.out.println("Crie outro cadastro para testar agora com o alterar");
		Computador comp2 = new Computador();
		
		// Executar o m�todo calcularValor() do novo objeto
		// coletar as informa��es e atribuir aos atributos
		System.out.print("Entre com a marca: ");
		comp2.marca = entrada.next();
		
		System.out.print("Entre com a cor: ");
		comp2.cor = entrada.next();
		
		System.out.print("Entre com o modelo: ");
		comp2.modelo = entrada.next();
		
		System.out.print("Entre com o Numero Serie: ");
		comp2.numeroSerie = entrada.nextInt();
		
		System.out.print("Entre com o preco: ");
		comp2.preco = entrada.nextDouble();
		
		comp2.calcularValor();
		comp2.imprimir();
		
		// Executar para o novo objeto o m�todo alterarValor() com um valor positivo
		System.out.println("------ ALTERAR VALOR DO PRE�O ------");
		System.out.println("Entre com um valor POSITIVO para teste");
		System.out.println();
		
		double alterar = comp2.preco;
		
		System.out.print("Entre com o novo preco: ");
		alterar = entrada.nextDouble();
		
		alterar = comp2.alterarValor(alterar);
		
		System.out.println();
		comp2.imprimir();
		System.out.println();	
		
		// Executar para o novo objeto o m�todo alterarValor() com um valor negativo
		System.out.println("------ ALTERAR VALOR DO PRE�O ------");
		System.out.println("Entre com um valor NEGATIVO para teste");
		System.out.println();
		
		System.out.print("Entre com o novo preco: ");
		alterar = entrada.nextDouble();
		
		alterar = comp2.alterarValor(alterar);
		
		System.out.println();
		comp2.imprimir();
		System.out.println();		
	}

}
