package exercicio.uri.caroline_souza;

import java.util.Scanner;

public class Ex1157 {
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		
		 int N = src.nextInt();
		 		 
		 for(int i = 1; i <= N; i++) {
			 if(N%i == 0) {
				 System.out.printf("%d\n",i);
			 }
		 }
		
		src.close();
	}

}
