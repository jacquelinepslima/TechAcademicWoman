package exercicio.uri.caroline_souza;

import java.util.Scanner;

public class Ex1035 {
	public static void main(String[]args) {
		Scanner src = new Scanner(System.in);
		int A,B,C,D;
		A = src.nextInt();
		B = src.nextInt();
		C = src.nextInt();
		D = src.nextInt();
		int somaCD = C + D;
		int somaAB = A + B;
		
		if((B > C && D > A) && (somaCD > somaAB) && (C >= 0) && (D >= 0) && (A%2 == 0)) {
			System.out.printf("Valores aceitos");
		}else {
			System.out.printf("Valores nao aceitos");
		}
		
		src.close();
		
	}

}
