package horario;

import java.util.Scanner;

public class HorarioPrincipal {

	public static void main(String[] args) {
		// Variaveis para pegar os valores do usuario
		int hr;
		int min;
		int seg;
		
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		// Solicita do usuário valores para hora, minuto e segundo.
		System.out.print("Entre com a Hora: ");
		hr = entrada.nextInt();
		System.out.print("Entre com o Minuto: ");
		min = entrada.nextInt();
		System.out.print("Entre com o Segundo: ");
		seg = entrada.nextInt();
		
		// Instancia um objeto da classe Horario
		Horario horario = new Horario(hr, min, seg); 

		// Incrementa segundo
		horario.incrementarSegundo();
		
		// Exibir o horário
		horario.mostrarHorario();
		
		// laço para chamar 5000
		int i;
		for(i = 1; i < 5000; i++) {
			horario.incrementarSegundo();
			horario.mostrarHorario();
		}
	}

}
