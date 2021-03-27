package atividade2;

public class TestePrincipal {

	public static void main(String[] args) {
		
		// TESTE CLASSE Projeto
		/*Produto projeto = new Produto("TV", 10, 2400);
		projeto.imprimir();
		
		projeto.adicionar(20);
		projeto.imprimir();
		*/
		
		ProdutoPerecivel p = new ProdutoPerecivel("TV", 10, 2400);
		Data d = new Data(1, 1, 2021);
		Data dr = new Data(1, 1, 2021);
		p.setDataValidade(d);
		p.setDataRetirada(dr);
		p.imprimir();
		
		// Retirar
		System.out.println("Retirado");
		p.retirar(7);
		p.imprimir();
		
		// Adicionar
		p.adicionar(5);
		p.imprimir();
		
	}

}
