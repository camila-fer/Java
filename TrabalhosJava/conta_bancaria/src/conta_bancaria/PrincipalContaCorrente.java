package conta_bancaria;

import java.util.Scanner;

public class PrincipalContaCorrente {

	private static final int NULL = 0;

	public static void main(String[] args) {
		// criar um objeto da classe Scanner
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);

		// definir um objeto para a classe ContaCorrente
		ContaCorrente conta1 = new ContaCorrente();

		// laço para repetir o menu
		int resposta = 1; // inicio com 1
		double valor; // variavel para armazenar o dado que o usuario digitar

		while (resposta == 1) { // se resposta for igual a 1

			int opcao; // variavel para pegar opcao do teclado

			System.out.println("Escolha uma opcao abaixo:");
			System.out.println("[1] Cadastrar");
			System.out.println("[2] Saque");
			System.out.println("[3] Consultar Saldo");
			System.out.println("[4] Deposito");
			opcao = entrada.nextInt();

			switch (opcao) { // inicio do switch

			case 1: // cadastrar
				System.out.println("------ NOVO CADASTRO ------");
				// coletar as informações e atribuir aos atributos
				System.out.print("Entre com a conta: ");
				conta1.conta = entrada.nextInt();
				System.out.print("Entre com a agencia: ");
				conta1.agencia = entrada.nextInt();
				System.out.print("Entre com o nome: ");
				conta1.nomeCliente = entrada.next();
				System.out.println("--------------------");

				conta1.imprimir(); // chamo o método para imprimir
				System.out.println("Cadastro realizado com sucesso!");
				break;

			case 2: // saque
				if(conta1.conta == NULL) {
					// pede para realizar cadastro
					System.out.println("Nao ha nenhuma conta cadastrada");
					System.out.println("Realize o cadastro");
				}else {
					System.out.println("------ SAQUE ------");
					System.out.print("Digite o valor do saque: ");
					valor = entrada.nextDouble();
					conta1.sacar(valor);
					System.out.println("--------------------");
				}
				break;

			case 3: // consultar saldo
				if(conta1.conta == NULL) { // caso seja nulo
					// pede para realizar cadastro
					System.out.println("Nao ha nenhuma conta cadastrada");
					System.out.println("Realize o cadastro");
				}else { // senao mostra os valores na tela
					System.out.println("------ CONSULTA DE SALDO ------");
					conta1.imprimeSaldo();
					conta1.imprimir();	
					System.out.println("--------------------");
				}
				break;

			case 4: // deposito
				System.out.println("------ DEPOSITO ------");
				System.out.print("Digite o valor do deposito: ");
				valor = entrada.nextDouble();
				conta1.depositar(valor);
				System.out.println("Deposito realizado com sucesso!");
				System.out.println("--------------------");
				break;

			default: // caso a opcao seja invalida
				System.out.println("Voce digitou uma opcao invalida");
				break;
			} // fim do switch

			// msg que pergunta se o usuario deseja continuar
			System.out.println("Deseja realizar outra operacao? [1]sim [2]nao");
			resposta = entrada.nextInt(); // pede para o usuario digitar

			if (resposta != 1) { // se resposta for diferente de 1
				System.out.println("Finalizando..."); // finaliza o programa
			}

		} // while

	}

}
