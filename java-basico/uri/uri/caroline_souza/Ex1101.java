package exercicio.uri.caroline_souza;

import java.util.Scanner;

public class Ex1101 {
	public static void main(String[]args) {
		Scanner src = new Scanner(System.in);
		
		int M,N;
				
		M = src.nextInt();
		N = src.nextInt();
		
		if(M <=0 || N <= 0) {
			 System.exit(0);
		}
		while(M >0 && N >0) {
			if(M < N) {
				System.out.printf("%d %d %d %d Sum=%d\n",M, M+1,M+2,M+3,M+(M+1)+(M+2)+(M+3));
			}else if(N < M){
				System.out.printf("%d %d %d %d Sum=%d\n",N, N+1,N+2,N+3,N+(N+1)+(N+2)+(N+3));
				
			}
			
			M = src.nextInt();
			N = src.nextInt();
		}
		
		src.close();
	}

}
