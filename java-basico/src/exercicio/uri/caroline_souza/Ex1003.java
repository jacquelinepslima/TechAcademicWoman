package exercicio.uri.caroline_souza;

import java.util.Scanner;

public class Ex1003 {
	public static void main (String[] args) {
		Scanner sr = new Scanner(System.in);
		int valor1 = sr.nextInt();
		int valor2 = sr.nextInt();
		
		int soma = valor1 + valor2;
		
		System.out.printf("SOMA = %d", soma);
		
		sr.close();
		
	}
}
