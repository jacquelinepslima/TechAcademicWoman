package exercicio.uri.caroline_souza;

import java.util.Scanner;

public class Ex1046 {
	public static void main(String[]args) {
		Scanner src = new Scanner(System.in);
		
		int horaFinal, horaInicial;
		int total;
		
		horaInicial = src.nextInt();
		horaFinal = src.nextInt();
		
		if(horaInicial < horaFinal) {
			total = horaFinal - horaInicial;
		}
		else if(horaInicial > horaFinal) {
			total = 24 - (horaInicial - horaFinal);
		}else {
			total = 24 - (horaInicial - horaFinal);
		}
		
		System.out.printf("O JOGO %d HORA(S)", total);
		
		src.close();
		
		
	}

}
