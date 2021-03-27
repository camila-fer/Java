package parte3;

import java.util.ArrayList;

public class FichaCliente {

	protected Cliente cli;
	protected ArrayList<Compra> compras = new ArrayList<Compra>();

	// Construtor
	public FichaCliente(Cliente cli, ArrayList<Compra> compras) {
		this.cli = cli;
		this.compras = compras;
	}

	// Encapsulamento
	public Cliente getCli() {
		return cli;
	}

	public void setCli(Cliente cli) {
		this.cli = cli;
	}

	public ArrayList<Compra> getCompras() {
		return compras;
	}

	public void setCompras(ArrayList<Compra> compras) {
		this.compras = compras;
	}

	public void iniciarClienteCompra() {
		System.out.println("------ FICHA CLIENTE ------");
		System.out.println("ID: " + cli.getId());
		System.out.println("Nome: " + cli.getNome());
		System.out.println("Endereço: " + cli.getEndereco());
	}
}
