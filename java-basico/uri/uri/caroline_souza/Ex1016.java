package exercicio.uri.caroline_souza;

import java.util.Scanner;

public class Ex1016 {
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		int distancia = src.nextInt(); 
		int minutos = (distancia * 60)/30;
		
		System.out.printf("%d minutos", minutos);
		src.close();
		
		
	}

}
