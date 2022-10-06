package exercicio.uri.caroline_souza;

import java.util.Scanner;

public class Ex1007 {
	public static void main(String[]args){
		Scanner src = new Scanner(System.in);
		int A = src.nextInt();
		int B = src.nextInt();
		int C = src.nextInt();
		int D = src.nextInt();
		int DIFERENCA = (A*B-C*D);
		
		System.out.printf("DIFERENCA = %d", DIFERENCA);
		
		src.close();
		
	}
	
}
