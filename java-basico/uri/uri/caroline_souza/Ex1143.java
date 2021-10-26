package exercicio.uri.caroline_souza;

import java.util.Scanner;

public class Ex1143 {
	public static void main(String[]args) {
		Scanner src = new Scanner(System.in);
		
		int N = src.nextInt();
		for(int i= 1; i <=N; i++) {
			System.out.printf("%d %d %d\n",i,i*i,(i*i)*i);
		}
		src.close();
	}

}
