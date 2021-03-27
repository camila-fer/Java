package conta_bancaria;

public class ContaCorrente {
	// declaro as variaveis
	int conta;
	int agencia;
	double saldo;
	String nomeCliente;
	
	boolean sacar(double valor) {
		if(valor > saldo) { // caso n�o tenha nenhum valor/vazio
			// mostro msg na tela
			System.out.println("Saque n�o realizado");
			System.out.println("Realize o deposito para pode sacar");
			return false;
		}
		else { // caso tenha saldo na conta
			saldo = saldo - valor; // realizo a opera��o
			// mostra o valor da conta
			System.out.println("Seu saldo agora � de: " + saldo);
			return true;
		}
		
	}
	
	void depositar(double valor) {
		// faz o deposito na conta
		saldo = saldo + valor;
		// mostra o valor da conta
		System.out.println("Voc� depositou: " + saldo);		
	}
	
	void imprimeSaldo() {
		// mostro os dados na tela
		System.out.println("Saldo disponivel: " + saldo);
	}
	
	void imprimir() {
		// mostro os dados na tela
		System.out.println("Conta: " + this.conta);
		System.out.println("Agencia: " + this.agencia);
		System.out.println("Nome: " + this.nomeCliente);
	}
	
	
}
