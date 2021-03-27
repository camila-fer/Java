package parte3;

import parte2.Pagamento;
import projeto_final.Pedido;

public class Compra {
	protected double valorTotal;
	protected Pedido ped; // Associação com a classe Pedido
	protected Pagamento pag; // Associação com a classe Pagamento
	
	// Encapsulamento
	public double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	public Pedido getPed() {
		return ped;
	}
	public void setPed(Pedido ped) {
		this.ped = ped;
	}
	public Pagamento getPag() {
		return pag;
	}
	public void setPag(Pagamento pag) {
		this.pag = pag;
	}
	
}
