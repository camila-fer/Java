package projeto_final;

import java.util.Scanner;

import parte2.Boleto;
import parte2.CartaoDeCredito;
import parte2.Pagamento;
import parte2.TipoPagamento;
import parte3.Cliente;
import parte3.Compra;
import parte3.FichaCliente;

public class TestePrincipal {

	@SuppressWarnings("unused")
	private static int opcao1;

	public static void main(String[] args) {

		// TESTE CLASSE Pedido
		Pedido ped = new Pedido();
		/* adiciona as datas de validade e adiciona
		   o objeto nos produtos adicionados abaixo
		*/	
		Data produto1 = new Data(1, 2, 2021);
		Data produto2 = new Data(15, 2, 2021);
		Data produto3 = new Data(20, 3, 2021);
		Data produto4 = new Data(5, 3, 2021);

		System.out.println("");
		System.out.println("CARRINHO DE COMPRAS");

		ped.iniciar();
		// Código do pedido
		ped.setIdPedido(4);
		System.out.println("Código do Pedido : " + ped.getIdPedido());
		ped.adicionarProdutos("Maça", 4.17, 3, produto1);
		ped.adicionarProdutos("Uva Roxa Bandeija", 6.98, 1, produto2);
		ped.adicionarProdutos("Morango Bandeija", 11.98, 2, produto3);
		ped.adicionarProdutos("Mamão", 1.19, 1, produto4);

		ped.calcularValor();

		// FORMA DE PAGAMENTO
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);

		Pagamento pag = new Pagamento();
		System.out.println("");
				
		System.out.println("Digite [1] para Cartão de Crédito e [2] para Boleto: ");
		int opcao = entrada.nextInt();

		switch (opcao) { // Switch case para escolher qual forma pagamento desejada
		case 1:
			TipoPagamento cartao = new CartaoDeCredito();

			pag.setPagamento(cartao);

			System.out.println("");
			System.out.println("----------PAGAMENTO----------");
			System.out.println("");
			System.out.println("Pagamento por Cartão de Crédito " + cartao.formaPagEscolhida());
			System.out.println("Faturamento: " + cartao.getDiasFaturamento());
			System.out.println("Porcentagem Financeira: " + cartao.getPorcentagemFinanceira());

			double somacredito;

			somacredito = ((ped.calcularValor() * cartao.getPorcentagemFinanceira() / 100) + ped.calcularValor());
			System.out.println("Total a Pagar: " + String.format("%.2f%n", somacredito));
			System.out.println("-----------------------------");

			break;
		case 2:
			TipoPagamento boleto = new Boleto();

			pag.setPagamento(boleto);

			System.out.println("");
			System.out.println("----------PAGAMENTO----------");
			System.out.println("");
			System.out.println("Pagamento por Boleto " + boleto.formaPagEscolhida());
			System.out.println("Faturamento: " + boleto.getDiasFaturamento());
			System.out.println("Porcentagem Financeira: " + boleto.getPorcentagemFinanceira());

			double somaboleto;
			somaboleto = ((ped.calcularValor() * boleto.getPorcentagemFinanceira() / 100) + ped.calcularValor());
			System.out.println("Total a Pagar: " + String.format("%.2f%n", somaboleto));
			System.out.println("-----------------------------");
			break;
		default:
			System.out.println("Opção Inválida!!! ");
			System.out.println("Digite [1] para Cartão de Crédito e [2] para Boleto: ");
			opcao1 = entrada.nextInt();
			break;

		}

		// TESTE CLASSE Cliente
		Cliente cli = new Cliente();

		cli.setId(2);
		cli.setNome("Camila");
		cli.setEndereco("Bom Jesus");
		
		// TESTE DA CLASSE FichaDeCliente
		FichaCliente cliente = new FichaCliente(cli, null);
		
		cliente.iniciarClienteCompra();
	
		// TESTE DA CLASSE Compra
		Compra cp = new Compra();
		cp.setPed(ped);
		System.out.println("Código do Pedido: " + cp.getPed().getIdPedido());
		cp.setValorTotal(ped.calcularValor());
		
		cp.setPag(pag);
		System.out.println("Tipo Pagamento: " + cp.getPag().formaPagEscolhida());
		
		System.out.println("---------------------");
		

	}

}
