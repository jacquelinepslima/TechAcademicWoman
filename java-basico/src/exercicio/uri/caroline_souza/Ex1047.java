package exercicio.uri.caroline_souza;

import java.util.Scanner;

public class Ex1047 {
	public static void main(String[]args) {
		Scanner src = new Scanner(System.in);
		int horaInicial, horaFinal, minutoInicial, minutoFinal;
		int minutoTotal;
		int horaTotal;
		
		horaInicial = src.nextInt();
		minutoInicial = src.nextInt();
		horaFinal = src.nextInt();
		minutoFinal = src.nextInt();
		
		if((horaFinal > horaInicial) && (minutoFinal > minutoInicial)) {
			horaTotal = horaFinal - horaInicial;
			minutoTotal = minutoFinal - minutoInicial;
			System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTOS",horaTotal,minutoTotal);
		}else if(horaFinal == horaInicial) {
			System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTOS");
		}else if((horaFinal > horaInicial) && (minutoFinal < minutoInicial)){
			horaTotal = horaFinal - horaInicial;
			horaTotal-=1;
			int aux = minutoInicial - minutoFinal;
			minutoTotal = 60 - aux;
			System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTOS",horaTotal,minutoTotal);
			
			
		}
		src.close();
		
	}
}
