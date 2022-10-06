package exercicio.uri.caroline_souza;

import java.util.Scanner;

public class Ex1044 {
	public static void mains(String[]args) {
		Scanner src = new Scanner(System.in);
		
		int A,B;
		
		A = src.nextInt();
		B = src.nextInt();
		
		if(B%A == 0) {
			System.out.printf("Sao multiplos");
		}
		else {
			System.out.printf("Nao sao multiplos");
		}
		
		src.close();
		
	}

}
