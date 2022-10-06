package exercicio.uri.caroline_souza;

import java.util.Scanner;

public class Ex1153 {
	public static void main(String[]args) {
		Scanner src = new Scanner(System.in);
		
		int fatorial=0;
		int N = src.nextInt();
		
		if(N > 0 && N < 13){
			fatorial = N*(N-1);
			for(int i = 2; i < N; i++) {
				fatorial = fatorial*(N-i);
			}
			System.out.printf("%d",fatorial);
		}
		
		
		
		
		src.close();
	}

}
