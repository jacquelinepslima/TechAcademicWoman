package exercicio.uri.caroline_souza;

import java.util.Scanner;

public class Ex1080 {
	public static void main(String[]args) {
		Scanner src = new Scanner(System.in);
		
		int N ,maior=0;
		int posicao=0;
		
		
		for(int i = 1; i < 1001; i++) { 
			N = src.nextInt();
			if(N > maior) {
				maior = N;
				posicao = i;
			}
			
		}
		System.out.printf(" maior: %d",maior);
		System.out.printf(" posicao: %d",posicao);
		
		
		src.close();
	}

}
