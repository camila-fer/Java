package livro;

public class LivroPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Livro livro = new Livro();
		Autor autor = new Autor();

		autor.setNome("Sherlock Holmes");
		autor.setPais("Reino Unido");
		autor.setSexo("Masculino");
		livro.setTitulo("Um estudo em vermelho");
		livro.setAno(2019);
		livro.setAutor(autor);

		livro.imprimir();
		autor.imprimir();
	}

}
