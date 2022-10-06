package exercicio.uri.caroline_souza;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[]args) {
		Scanner src = new Scanner(System.in);
		
		int M, N;
		M = src.nextInt();
		N = src.nextInt();
		
		
		int[][] A = new int[M][N];
		int[][] B = new int[M][N];
		int[][] C = new int[M][N];
		
		for(int i=0; i<M; i++) {
			for(int j=0;j<N;j++) {
				A[i][j]=src.nextInt();
			}
		}
		
		for(int i=0; i<M; i++) {
			for(int j=0;j<N;j++) {
				B[i][j]=src.nextInt();
			}
		}
		
		for(int i=0; i<M; i++) {
			for(int j=0;j<N;j++) {
				C[i][j] = A[i][j] + B[i][j];
			}
		}
		for(int i=0; i==0; i++) {
			for(int j=0;j<N;j++) {
				System.out.print(C[i][j]+" ");
			}
			System.out.println();
		}
		
		
		for(int i=1; i==1; i++) {
			for(int j=0;j<N;j++) {
				System.out.print(C[i][j]+" ");
			}
			System.out.println();
		}
		src.close();
	}

}
