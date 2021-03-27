package estudoCaso_Heranca;

import java.util.Scanner;

public class TestePrincipal {

	public static void main(String[] args) {
		
		// criar um objeto da classe Scanner
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		// Pego as informações do usuario
		System.out.print("Digite o nome: ");
		String nome = entrada.nextLine();
		System.out.print("Digite o Endereço: ");
		String endereco = entrada.nextLine();
		System.out.print("Digite o Telefone: ");
		String telefone = entrada.next();	
		System.out.print("Digite o Credito: ");
		double valorCredito = entrada.nextDouble();
		System.out.print("Digite a Divida: ");
		double valorDivida = entrada.nextDouble();
		
		// chamo o objeto da subclasse Fornecedor
		Fornecedor fornecedor = new Fornecedor(nome, endereco, telefone, valorCredito, valorDivida);
		
		fornecedor.setNome(nome);
		fornecedor.setEndereco(endereco);
		fornecedor.setTelefone(telefone);
		fornecedor.setValorCredito(valorCredito);
		fornecedor.setValorDivida(valorDivida);
		
		// Chamo os métodos
		fornecedor.imprimir();
		fornecedor.obterSaldo(valorCredito);
		fornecedor.imprimir();
		
		// Pego as informações do usuario
		System.out.print("Digite o Código do Setor: ");
		int codigoSetor = entrada.nextInt();
		System.out.print("Digite o Salário Base: ");
		double salarioBase = entrada.nextDouble();
		System.out.print("Digite o Percentual de Aumento(%): ");
		double imposto = entrada.nextDouble();
		
		// chamo o objeto da subclasse Empregado
		Empregado emprega = new Empregado(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
		
		emprega.setSalarioBase(salarioBase);
		emprega.setCodigoSetor(codigoSetor);
		emprega.setImposto(imposto);
		
		// Chamo os métodos
		emprega.calcularSalario();
		emprega.imprimir();
		
		// ADMINISTRADOR
		// Pego as informações do usuario
		System.out.print("Digite a Ajuda de Custo: ");
		double ajudaDeCusto = entrada.nextDouble();
		
		// chamo o objeto da subclasse Administrador
		Administrador adm = new Administrador(nome, endereco, telefone, codigoSetor, salarioBase, imposto, ajudaDeCusto);
		
		adm.setAjudaDeCusto(ajudaDeCusto);
		
		// Chamo o método
		adm.calcularSalario();
		adm.imprimir();
		
		// Operador
		// Pego as informações do usuario
		System.out.print("Digite o Valor de Produção: ");
		double valorProducao = entrada.nextDouble();
		System.out.print("Digite o da Comissão (Porcentagem de aumento%): ");
		double comissao = entrada.nextDouble();
		
		Operario opera = new Operario(nome, endereco, telefone, codigoSetor, ajudaDeCusto, imposto, valorProducao, comissao);
		
		opera.calcularSalario();
		opera.imprimir();
		
		// VENDEDOR
		// Pego as informações do usuario
		System.out.print("Digite o Valor da Venda: ");
		double valorVendas = entrada.nextDouble(); 
		System.out.print("Digite a Comissão (Porcentagem de aumento(%): ");
		double comissao1 = entrada.nextDouble();
		
		Vendedor vendedor = new Vendedor(nome, endereco, telefone, codigoSetor, valorProducao, imposto, valorVendas, comissao1);
		
		vendedor.calcularSalario();
		vendedor.imprimir();
	}

}
