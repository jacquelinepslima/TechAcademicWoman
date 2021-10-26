package exercicio.uri.byanca_calixto;

import java.util.Scanner;

public class Ex1004 {
	public static void main (String[] args) {
		Scanner sr = new Scanner(System.in);
		
		int valor1 = sr.nextInt();
		int valor2 = sr.nextInt();
		int PROD = valor1 * valor2;
		
		System.out.printf("PROD = %d", PROD);
		
		sr.close();
		
	}
}
