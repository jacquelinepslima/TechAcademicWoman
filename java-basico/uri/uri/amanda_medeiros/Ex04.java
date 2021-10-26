package exercicio.uri.amanda_medeiros;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[]args) {
		Scanner src = new Scanner(System.in);
		
		int soma = 0;
		int N = src.nextInt();
		int[][] matriz = new int[N][N];
		
		
		for(int i=0; i<N; i++) {
			for(int j=0;j<N;j++) {
				matriz[i][j]=src.nextInt();
			}
		}
		
		
		for(int i=0; i<N; i++) {
			for(int j=0;j<N;j++) {
				if(i == 0 && j>0) {
					soma+=matriz[i][j];
				}
				if(i == 1 && j>1) {
					soma+=matriz[i][j];
				}
				
			}
		}
		System.out.printf("%d\n",soma);
		
		
		src.close();
	}

}
