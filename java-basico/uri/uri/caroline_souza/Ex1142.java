package exercicio.uri.caroline_souza;

import java.util.Scanner;

public class Ex1142 {
	public static void main(String[]args) {
		Scanner src = new Scanner(System.in);
		
		int N = src.nextInt();
		
		for(int i=1; i<=N*4; i+=4) {
			System.out.printf("%d %d %d PUM\n", i, i+1,i+2);
		}
		
		src.close();
	}

}
