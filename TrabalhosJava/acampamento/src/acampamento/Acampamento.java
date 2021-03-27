package acampamento;

public class Acampamento {
	// declaro as variaveis
	 private String nome;
	 private String equipe;
	 private int idade;
	 
	 // Encapsulamento
	 public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEquipe() {
		return equipe;
	}

	public void setEquipe(String equipe) {
		this.equipe = equipe;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	// métodos
	 public void imprimir() {
		 // mostro os dados na tela
		 System.out.println("------ DADOS ------");
		 System.out.println("Nome: " + this.nome);
		 System.out.println("Equipe: " + this.equipe);
		 System.out.println("Idade: " + this.idade);
		 System.out.println("-------------------");
	 }
	 
	 public void separarGrupo() {
		 if(idade >= 6 && idade <=10) {
			 this.equipe = "A";
		 }
		 else if(idade >= 11 && idade <= 20) {
			 this.equipe = "B";
		 }
		 else if(idade >= 21) { 
			 this.equipe = "C";
		 }
		 
	 }
}
